package com.galaxe.chanSelect.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galaxe.chanSelect.model.PhoneBO;

@Repository
public interface PhoneDAO extends JpaRepository<PhoneBO, String> {
	
	@Query(value = "SELECT * FROM mem_phone p WHERE p.mem_id = :memId AND p.date_of_birth = :date", nativeQuery= true)
	List<PhoneBO> findByMemIdAndDateOfBirth(@Param("memId") Integer memId, @Param("date") Date date);


}
