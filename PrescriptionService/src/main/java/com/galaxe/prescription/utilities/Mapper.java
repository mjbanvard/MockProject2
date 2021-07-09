package com.galaxe.prescription.utilities;

import java.util.ArrayList;
import java.util.List;

import com.galaxe.prescription.domain.PrescriptionVO;
import com.galaxe.prescription.model.PrescriptionBO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mapper {
	
		public static PrescriptionVO boToVo(PrescriptionBO prescriptionBo) {
			PrescriptionVO prescriptionVo = new PrescriptionVO();
			prescriptionVo.setId(prescriptionBo.getId());
			prescriptionVo.setMemberId(prescriptionBo.getMemberId());
			prescriptionVo.setGroupId(prescriptionBo.getGroupId());
			prescriptionVo.setCarrierId(prescriptionBo.getCarrierId());
			prescriptionVo.setAgn(prescriptionBo.getAgn());
			return prescriptionVo;
		}
		
		public static PrescriptionBO voToBo(PrescriptionVO prescriptionVo) {
			PrescriptionBO prescriptionBo = new PrescriptionBO();
			prescriptionBo.setId(prescriptionVo.getId());
			prescriptionBo.setMemberId(prescriptionVo.getMemberId());
			prescriptionBo.setGroupId(prescriptionVo.getGroupId());
			prescriptionBo.setCarrierId(prescriptionVo.getCarrierId());
			prescriptionBo.setAgn(prescriptionVo.getAgn());
			return prescriptionBo;
		}
		
		public static List<PrescriptionVO> listBoToVo(List<PrescriptionBO> boList) {
			List<PrescriptionVO> voList = new ArrayList<PrescriptionVO>();
			for(PrescriptionBO script : boList) {
				voList.add(boToVo(script));
			}
			log.trace("Mapping...");
			return voList;
		}

}
