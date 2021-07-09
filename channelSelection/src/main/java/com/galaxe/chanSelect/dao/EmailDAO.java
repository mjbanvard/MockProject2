package com.galaxe.chanSelect.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.chanSelect.model.EmailBO;

@Repository
public interface EmailDAO extends JpaRepository<EmailBO, String> {

	@Query(value = "SELECT * FROM mem_email e WHERE e.mem_id= :memId AND e.date_of_birth= :date", nativeQuery= true)
	List<EmailBO> findByMemIdAndDateOfBirth(@Param("memId")Integer memId, @Param("date") Date date);
	
}
