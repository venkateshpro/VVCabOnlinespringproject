package com.vvcabs.ControllerImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class LoginControllerImpl {
	
	int cus_id;
	
	int dri_id;
	
	String cus_name;
	
	@Autowired
	customerrepo cusr;
	
	


	
	@Autowired
	driverrepo drepo;
	
	Logger logger=LoggerFactory.getLogger(LoginControllerImpl.class);
	ModelAndView modelAndView = new ModelAndView();


	@GetMapping("/")
	public ModelAndView login() {

		modelAndView.setViewName("Login.jsp");
		logger.info("Login Page strted");
		return modelAndView;
	}

	

	@PostMapping(value = "/validate")
	public ModelAndView validate(@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "psw", required = false) String psw,@RequestParam(value = "role", required = false) String role) {

		Customer cus = cusr.findByEmailAndPassword(email, psw);
		cab_Driver d= drepo.findByEmailAndPassword(email, psw);
		String ch;
		
			ch=role;
			
			switch(ch) {
			case "customer":
				if (cus != null) {
					logger.info("Validation Sccuessfully Done");
					cus_id=cus.getUser_Id();
					cus_name=cus.getUser_name();					
					modelAndView.addObject("name", cus_name);
					modelAndView.addObject("id", cus_id);
					modelAndView.setViewName("Homepage.jsp");
					logger.info("customer Name"+" "+cus_name +" "+"Customer Page Displyed");
					return modelAndView;
					
					
				}
				
				
				else { 
					ModelAndView modelAndView = new ModelAndView("alertfails.jsp");
					logger.error("You Entered Wrong Credentails Please Check");
					//modelAndView.setViewName("alertfails.html");
					return modelAndView
;
				}	
			case "driver":
				if (d != null) {
					logger.info("Driver Page Started");
					String name=d.getDriver_name();
					dri_id=d.getD_Id();
					modelAndView.setViewName("Driver.jsp");
					modelAndView.addObject("name", name);
					logger.info("Driver Name"+" "+name +" "+"Driver Page Displyed");
					return modelAndView;

					
				}
				else { 
					logger.error("You Entered Wrong Credentails Please Check");
					modelAndView.setViewName("alertfails.jsp");
				}
			case "admin":
				logger.info("Admin Page Started");

				if (cus != null) {
					modelAndView.setViewName("Admin.jsp");
					logger.info("Driver Name"+" "+"Admin" +" "+"Driver Page Displyed");
					return modelAndView;
				}
				else {
					logger.error("You Entered Wrong Credentails Please Check");
					modelAndView.setViewName("alertfails.jsp");
				}
			}
			return null;
			
		
		


	}

}
