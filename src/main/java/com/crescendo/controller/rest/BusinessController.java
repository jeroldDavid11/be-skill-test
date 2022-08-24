package com.crescendo.controller.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.model.Business;
import com.crescendo.service.BusinessServiceImpl;

@RestController
@RequestMapping("/api")
public class BusinessController {
	
	  @Autowired
	  BusinessServiceImpl businessService;
	
	
	  @RequestMapping(value="/businesses", method=RequestMethod.GET)
	  public ResponseEntity<Object> GetAllBusiness() throws IOException {
		    return new ResponseEntity<Object>(businessService.getAllBusiness(), HttpStatus.OK);
	  }
	  
	  @RequestMapping(value="/businesses/{id}", method=RequestMethod.GET)
	  public ResponseEntity<Object> GetSpecificBusiness(@PathVariable("id") long id) throws IOException {
		    return new ResponseEntity<Object>(businessService.getABusiness(id), HttpStatus.OK);
	  }
	  
	  @RequestMapping(value="/businesses", method=RequestMethod.POST)
	  public ResponseEntity<Object> CreateNewBusiness(@RequestBody Business business) throws IOException {
		    return new ResponseEntity<Object>(businessService.createnNewBusiness(business), HttpStatus.OK);
	  }
	  
	  @RequestMapping(value="/businesses/{id}", method=RequestMethod.PUT)
	  public ResponseEntity<Object> UpdateBusiness(@RequestBody Business business,@PathVariable("id") int id) throws IOException {
		    return new ResponseEntity<Object>(businessService.updateBusiness(id,business), HttpStatus.OK);
	  }
	  
	  @RequestMapping(value="/businesses/{id}", method=RequestMethod.DELETE)
	  public ResponseEntity<Object> DeleteBusiness(@PathVariable("id") int id) throws IOException {
		    return new ResponseEntity<Object>(businessService.deleteBusiness(id), HttpStatus.OK);
	  }

}
