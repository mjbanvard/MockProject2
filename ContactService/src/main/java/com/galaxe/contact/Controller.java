package com.galaxe.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.contact.domain.AddressResponse;
import com.galaxe.contact.domain.AddressVO;
import com.galaxe.contact.domain.GroupCarrierVO;
import com.galaxe.contact.service.AddressService;

@RestController
public class Controller {

	@Autowired
	AddressService addressService;
	
	
	@RequestMapping(value= "/")
	@ResponseBody
//	public ResponseEntity<Object> addAddress(@RequestBody GroupCarrierVO request){
	public AddressResponse addAddress(@RequestBody GroupCarrierVO request){
				
		AddressResponse recResponse = new AddressResponse();
		List<AddressVO> addressVO = addressService.getAddress(request);
				
		//Got rid of 'response' in method name
		recResponse.setAddress(addressVO); 
	
				
//		return new ResponseEntity <Object>(recResponse, HttpStatus.OK);
		return recResponse;
	}
	
}
