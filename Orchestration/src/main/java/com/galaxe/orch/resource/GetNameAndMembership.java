package com.galaxe.orch.resource;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.galaxe.orch.domain.Group;
import com.galaxe.orch.domain.Membership;
import com.galaxe.orch.domain.Name;
import com.galaxe.orch.domain.Recipient;
import com.galaxe.orch.service.OrchService;

@Controller
public class GetNameAndMembership {
	
	@Autowired
	OrchService orchServ;

	public Recipient main(Recipient recipient) {
		
		Integer id = recipient.getId();
		Date dateOfBirth = recipient.getDateOfBirth();
		
//		Membership membership = new Membership();
//		Group group = new Group();
//		Name name = new Name();
//		membership.setGroup(group);
//		recipient.setMembership(membership);
//		recipient.setName(name);
		
		recipient.setMembership(orchServ.getMembership(id, dateOfBirth));
		recipient.setName(orchServ.getName(id, dateOfBirth));
		
		return recipient;
		
	}

}
