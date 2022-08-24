package com.crescendo.service;

import java.util.ArrayList;

import com.crescendo.model.Review;

public interface IReviewService {
	
	public Review createnNewReview(Review review,long r);
	public ArrayList<Review> getAllReview(long r);
	
}
