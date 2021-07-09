package com.galaxe.contact.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.contact.model.AddressBO;


@Repository	
public interface AddressDAO extends JpaRepository<AddressBO, Integer> {
	
	//Changed query so that memId is Integer
	//Latest: removed memId.
//	@Query(value = "SELECT * FROM  address a WHERE a.memId= :memId and a.groupId = :groupId and a.carrierId = :carrierId", nativeQuery=true)
//	List<AddressBO> findByMemIdAndGroupIdAndCarrierId(@Param("memId")Integer memId, @Param("groupId")String groupId, @Param("carrierId")String carrierId);

	@Query(value = "SELECT * FROM  address a WHERE a.group_id = :groupId and a.carrier_id = :carrierId", nativeQuery=true)
	List<AddressBO> findByGroupIdAndCarrierId(@Param("groupId")String groupId, @Param("carrierId")String carrierId);

}
