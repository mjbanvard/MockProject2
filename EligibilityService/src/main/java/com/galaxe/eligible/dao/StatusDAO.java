package com.galaxe.eligible.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.eligible.model.StatusBO;



@Repository
public interface StatusDAO extends JpaRepository<StatusBO, Integer> {
	
	
	@Query(value= "SELECT * FROM status a WHERE a.memid= :memId and a.groupid = :groupId and a.carrierId = :carrierId", nativeQuery=true)
	StatusBO findByMemIdAndGroupIdAndCarrierId(@Param("memId")String memId, @Param("groupId")String groupId, @Param("carrierId")String carrier);
			}
