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
	public Name getName( Integer id, Date dateOfBirth ) {
		NameBO nameBo = nameDAO.findByIdAndDateOfBirth( id, dateOfBirth );
		Name name = new Name();
		name.setFirstName( nameBo.getFirstname() );
		name.setLastName( nameBo.getLastname() );
		
		return name;
	}

	@Override
	public Membership getMembership( Integer id, Date dateOfBirth ) {
		
		Membership memVo = new Membership();
		Group grpVo = new Group();
		
		MembershipBO memBo = new MembershipBO();
		memBo = membershipDAO.findByIdAndDateOfBirth( id, dateOfBirth );
		memVo.setDateOfBirth( memBo.getDateOfBirth() );
		grpVo.setCarrierId( memBo.getCarrierId() );
		grpVo.setGroupId( memBo.getGroupId() );
		memVo.setGroup( grpVo );
		
		return memVo;
	}

}
