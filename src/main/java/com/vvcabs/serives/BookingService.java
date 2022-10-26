package com.vvcabs.serives;

import java.util.List;

import com.vvcabs.Model.booking;

public interface BookingService {
	public void booking(String pick, String drop, int r_id, int cus_id, String cus_name, int price,int dri_id);
	public List<booking> bookinglist();
}
