package com.crescendo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.model.Business;
import com.crescendo.repository.BusinessRepository;

@Service 
public class BusinessServiceImpl implements IBusinessService {
	
	@Autowired
	BusinessRepository businessRepository;

	/*Create and Update*/
	public Business createnNewBusiness(Business business) {
		return businessRepository.save(business);
	}
	
	public String updateBusiness(long id, Business business) {
		// TODO Auto-generated method stub
		businessRepository.updateEntity(id, business.getBusinessName(), business.getAddress(), business.getPhone());
		return "Updated";
	}
	
	/*Delete*/
	public String deleteBusiness(long id) {
		businessRepository.deleteById(Long.valueOf(id));
		return "Entity Business Deleted" + id ;
	}

	/*Get*/
	public Business getABusiness(long id) {
		Optional<Business> business = businessRepository.findById(id);
		return business.get();
	}

	public ArrayList<Business> getAllBusiness() {
		return 	(ArrayList<Business>) businessRepository.findAll();
	}

}
