package com.vvcabs.serives;

import java.util.List;

import com.vvcabs.Model.request;

public interface RequestService {
	public List<request> listof_request();
	public void deletereq(int req);

}
