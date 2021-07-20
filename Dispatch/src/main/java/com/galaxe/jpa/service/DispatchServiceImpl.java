package com.galaxe.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.jpa.dao.DispatchDao;
import com.galaxe.jpa.domain.DispatchVO;
import com.galaxe.jpa.model.DispatchBO;

@Service
public class DispatchServiceImpl implements DispatchService {
	@Autowired
	DispatchDao dispatchDao;
	
	@Override
	public void getSaveRequest(DispatchVO dispatchVO) {
		DispatchBO dispatchBO = voToBo(dispatchVO);
		dispatchDao.save(dispatchBO);
	}

	private DispatchBO voToBo(DispatchVO dispatchVO) {
		DispatchBO dispatchBO = new DispatchBO();
		dispatchBO.setId(dispatchVO.getId());
		dispatchBO.setRequest(dispatchVO.getRequest());
		return dispatchBO;
	}

	

}
