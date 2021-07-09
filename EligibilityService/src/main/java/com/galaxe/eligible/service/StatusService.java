package com.galaxe.eligible.service;

import java.util.List;

import com.galaxe.eligible.domain.StatusVO;
import com.galaxe.eligible.domain.GroupCarrierVO;

public interface StatusService {
	public StatusVO getStatus(GroupCarrierVO request);

}
