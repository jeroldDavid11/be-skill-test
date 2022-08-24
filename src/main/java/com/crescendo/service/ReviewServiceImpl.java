package com.crescendo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.model.Review;
import com.crescendo.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements IReviewService{
	
	@Autowired
	ReviewRepository reviewRepository;

	public Review createnNewReview(Review review,long r) {
		review.setBussinessId(r);
		return reviewRepository.save(review);
	}


	public ArrayList<Review> getAllReview(long id) {
		return reviewRepository.getBussinessId(id);
	}

}
