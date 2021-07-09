package com.galaxe.orch.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.orch.DAO.MembershipDAO;
import com.galaxe.orch.DAO.NameDAO;
import com.galaxe.orch.domain.Group;
import com.galaxe.orch.domain.Membership;
import com.galaxe.orch.domain.Name;
import com.galaxe.orch.model.MembershipBO;
import com.galaxe.orch.model.NameBO;
import com.galaxe.orch.service.OrchService;

@Service
public class OrchServiceImpl implements OrchService {

	@Autowired
	NameDAO nameDAO;
	
	@Autowired
	MembershipDAO membershipDAO;
	
	@Override
	public Name getName(int id, Date dateOfBirth) {
		NameBO nameBo = nameDAO.findByIdAndDateOfBirth(id, dateOfBirth);
		Name name = new Name();
		name.setFirstName(nameBo.getFirstname());
		name.setLastName(nameBo.getLastname());
		
		return name;
	}

	@Override
	public Membership getMembership(int id, Date dateOfBirth) {
		Membership mem = new Membership();
		Group grp = new Group();
		MembershipBO memBo = membershipDAO.findByIdAndDateOfBirth(id, dateOfBirth);
		mem.setDateOfBirth(memBo.getDateOfBirth());
		grp.setCarrierId(memBo.getCarrierId());
		grp.setGroupId(memBo.getGroupId());
		mem.setGroup(grp);
		
		return mem;
	}

}
