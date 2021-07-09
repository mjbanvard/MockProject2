package com.galaxe.eligible.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.eligible.dao.StatusDAO;
import com.galaxe.eligible.domain.GroupCarrierVO;
import com.galaxe.eligible.domain.StatusVO;
import com.galaxe.eligible.model.StatusBO;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	StatusDAO statusDao;

	@Override
	public StatusVO getStatus(GroupCarrierVO request) {
		StatusVO statusVO = new StatusVO();
		try {
			System.out.println("In get status");
			StatusBO status = statusDao.findByMemIdAndGroupIdAndCarrierId(request.getId(), request.getGroupId(),
					request.getCarrierId());
			 statusVO = listBotolistVo(status);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return statusVO;
	}

	private StatusVO listBotolistVo(StatusBO status) {

		StatusVO avo = new StatusVO();

		avo.setBenefitGrp(status.getBenefitGrp());
		avo.setEligStatus(status.getEligStatus());

		return avo;
	}

	private List<StatusVO> listBotoListVo(List<StatusBO> listBo) {
		System.out.println("In mapping");
		List<StatusVO> listVo = new ArrayList<StatusVO>();
		for (StatusBO statusBo : listBo) {
			listVo.add(listBotolistVo(statusBo));

		}

		return listVo;

	}

}
