package com.galaxe.orch.DAO;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.orch.model.NameBO;

@Repository
public interface NameDAO extends JpaRepository<NameBO, Integer> {
	
	//Using Native Query, accesses table, confirms multiple columns, returns all columns in NameBO.

	@Query(value="Select * FROM name n WHERE n.member_id= :id AND n.date_of_birth= :dateOfBirth", nativeQuery=true)
	// SELECT every column FROM table t("shorthand" character) WHERE one column's value  == Parameter with key "id" AND == another column's value == Parameter with key "dateOfBirth"
	NameBO findByIdAndDateOfBirth(@Param("id")Integer id, @Param("dateOfBirth")Date dateOfBirth);
	// @Param sets values to keys, referred to in Native SQL @Query
	//Though the above method returns a list of rows, the return of a List of 1 is synonymous with a single Object. Note return type.

}
