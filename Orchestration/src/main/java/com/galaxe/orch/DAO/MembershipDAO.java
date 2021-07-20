package com.galaxe.orch.DAO;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.orch.model.MembershipBO;

@Repository
public interface MembershipDAO extends JpaRepository<MembershipBO, Integer> {

//	MembershipBO findByIdAndDateOfBirth(Integer id, Date dateOfBirth);
	
	//Using Native Query, accesses table, confirms multiple columns, returns all columns in MembershipBO.
	
	@Query(value="Select * FROM membership_2 m WHERE m.member_id= :id AND m.date_of_birth= :dateOfBirth", nativeQuery=true)
	MembershipBO findByIdAndDateOfBirth(@Param("id")Integer id, @Param("dateOfBirth")Date dateOfBirth);
	//Though the above method returns a list of rows, the return of a List of 1 is synonymous with a single Object. Note return type.

}
