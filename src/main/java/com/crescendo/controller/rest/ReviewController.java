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

import com.crescendo.model.Review;
import com.crescendo.service.ReviewServiceImpl;

@RestController
@RequestMapping("/api/businesses")
public class ReviewController {
	
	  @Autowired
	  ReviewServiceImpl reviewService;
	
	  @RequestMapping(value="/{id}/reviews", method=RequestMethod.GET)
	  public ResponseEntity<Object> GetAllReview(@PathVariable("id") long id) throws IOException {
		    return new ResponseEntity<Object>(reviewService.getAllReview(id), HttpStatus.OK);
	  }
	  
	  @RequestMapping(value="/{id}/reviews", method=RequestMethod.POST)
	  public ResponseEntity<Object> CreateNewReview(@PathVariable("id") long id,@RequestBody Review review) throws IOException {
		    return new ResponseEntity<Object>(reviewService.createnNewReview(review,id), HttpStatus.OK);
	  }
	  
	
}
