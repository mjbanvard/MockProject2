package com.galaxe.orch.service;

import java.sql.Date;
import com.galaxe.orch.domain.Membership;
import com.galaxe.orch.domain.Name;


public interface OrchService {
	
	Name getName(Integer id, Date dateOfBirth);
	
	Membership getMembership(Integer id, Date dateOfBirth);

}
