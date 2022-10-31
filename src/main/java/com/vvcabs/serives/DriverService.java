package com.vvcabs.serives;

import java.util.List;

import com.vvcabs.Model.cab_Driver;
/**
*
* @author Naga Venkatesh
*/
public interface DriverService {

	public cab_Driver addcab(cab_Driver c);
	public List<cab_Driver>  get_driverlist();
	public cab_Driver get_Driver_by_Id(int Id);
}
