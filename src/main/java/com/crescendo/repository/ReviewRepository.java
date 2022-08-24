package com.crescendo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crescendo.model.Review;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long>  {
	
	 @Modifying
	 @Query("SELECT r FROM Review r WHERE r.bussinessId = :bussinessId")
	 ArrayList<Review> getBussinessId(@Param("bussinessId") long bussinessId);
}
