package com.galaxe.jpa.dao;

import org.slf4j.Logger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galaxe.jpa.model.DispatchBO;

@Repository
public interface DispatchDao extends JpaRepository < DispatchBO, Integer >{
	


}
