package com.crescendo.service;

import java.util.ArrayList;

import com.crescendo.model.Business;

public interface IBusinessService {
	
	public Business createnNewBusiness(Business business);
	public String deleteBusiness(long id);
	public Business getABusiness(long id);
	public ArrayList<Business> getAllBusiness();
	public String updateBusiness(long id,Business business);
}
