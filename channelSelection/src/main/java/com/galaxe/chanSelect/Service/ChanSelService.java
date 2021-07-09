package com.galaxe.chanSelect.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.galaxe.chanSelect.domain.Email;
import com.galaxe.chanSelect.domain.Phone;

@Service
public interface ChanSelService {
	
	public List<Email> getEmail(Integer memberId, Date date);

	public List<Phone> getPhone(Integer memberId, Date date);

}
