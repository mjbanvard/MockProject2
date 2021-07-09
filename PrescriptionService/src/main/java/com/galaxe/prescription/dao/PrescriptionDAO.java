package com.galaxe.prescription.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.prescription.model.PrescriptionBO;
import java.lang.String;

@Repository
public interface PrescriptionDAO extends JpaRepository<PrescriptionBO, Integer> {
	
//	@Query(value = "SELECT * FROM prescription p WHERE p.group_id= :groupId AND p.carrier_id= :carrierId", nativeQuery= true)
//	List<PrescriptionBO> findByGroupIdAndCarrierId(@Param("groupId") String groupId, @Param("carrierId") String carrierId);
	
	// Commented down to one method. Changed memberId to an Integer.
	@Query(value= "SELECT agn FROM PrescriptionBO WHERE memberId= :memberId AND groupId= :groupId AND carrierId= :carrierId")
	String findByMemberIdAndGroupIdAndCarrierId(@Param("memberId") Integer memberId, @Param("groupId") String groupId, @Param("carrierId") String carrierId);
	
//	@Query(value = "SELECT p.agn FROM PrescriptionBO p WHERE p.groupId=:groupId AND p.carrierId=:carrierId")
//	String findAgnNumberByGroupIdAndCarrierId(@Param("groupId") String groupId, @Param("carrierId") String carrierId);
	
//	@Query(value= "SELECT agn FROM prescriptionBO WHERE memberId= :memberId AND (groupId= :groupId OR carrierId= :carrierId);")
//	String findByGroupIdAndCarrierId(String groupId, String carrierId);
	
}
