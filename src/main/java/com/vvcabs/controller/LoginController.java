package com.vvcabs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.vvcabs.Model.Customer;
import com.vvcabs.Model.cab_Driver;
import com.vvcabs.repo.customerrepo;
import com.vvcabs.repo.driverrepo;


@RestController
public class LoginController {
	
	int cus_id;
	
	int dri_id;
	
	String cus_name;
	
	@Autowired
	customerrepo cusr;
	


	
	@Autowired
	driverrepo drepo;
	


	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("Login.jsp");
		return modelAndView;
	}


	@PostMapping(value = "/validate")
	public ModelAndView validate_customer(@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "psw", required = false) String psw,@RequestParam(value = "role", required = false) String role) {

		Customer cus = cusr.findByEmailAndPassword(email, psw);
		cab_Driver d= drepo.findByEmailAndPassword(email, psw);
		String ch;
		
			ch=role;
			switch(ch) {
			case "customer":
				if (cus != null) {
					cus_id=cus.getUser_Id();
					cus_name=cus.getUser_name();
					System.out.println(cus_name);
					
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.addObject("name", cus_name);
					modelAndView.addObject("id", cus_id);

					modelAndView.setViewName("Homepage.jsp");
					return modelAndView;
					
					
				}
				else { 
					ModelAndView modelAndView = new ModelAndView("alertfails.html");

					//modelAndView.setViewName("alertfails.html");
					return modelAndView
;
				}	
			case "driver":
				if (d != null) {
					ModelAndView modelAndView = new ModelAndView();
					String name=d.getDriver_name();
					dri_id=d.getD_Id();
					//int cno=d.getCab_no();
					//dc.cabnoid(d_Id,cno);
					
					modelAndView.setViewName("Driver.jsp");
					modelAndView.addObject("name", name);

					return modelAndView;

					
				}
				else { 
					ModelAndView modelAndView = new ModelAndView();

					modelAndView.setViewName("alertfails.html");
				}
			case "admin":
				System.out.println("iam in admin");
				if (cus != null) {
					ModelAndView modelAndView = new ModelAndView();

					modelAndView.setViewName("Admin.jsp");
					return modelAndView;
				}
				else {
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.setViewName("alertfails.html");
				}
			}
			return null;
			
		
		


	}

}
