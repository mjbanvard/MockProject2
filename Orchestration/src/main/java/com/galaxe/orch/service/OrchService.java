package com.galaxe.orch.service;

import java.sql.Date;
import com.galaxe.orch.domain.Membership;
import com.galaxe.orch.domain.Name;


public interface OrchService {
	
	Name getName(int id, Date dateOfBirth);
	
	Membership getMembership(int id, Date dateOfBirth);

}
