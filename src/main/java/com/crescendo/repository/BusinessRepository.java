package com.crescendo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crescendo.model.Business;


@Repository
public interface BusinessRepository extends CrudRepository<Business, Long> {
	
	 @Transactional
	 @Modifying
	 @Query("Update Business set businessName = :businessName , address = :address , phone = :phone WHERE id = :entityId")
	 void updateEntity(@Param("entityId") long entityId,@Param("businessName") String businessName,@Param("address") String address,@Param("phone") String phone);
}
