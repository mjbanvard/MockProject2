package com.galaxe.eligible;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.galaxe.eligible.domain.GroupCarrierVO;
import com.galaxe.eligible.domain.StatusResponse;
import com.galaxe.eligible.domain.StatusVO;
import com.galaxe.eligible.service.StatusService;

@RestController
public class Controller {
	
		@Autowired
		StatusService statusService;
		
		@PostMapping(value= "/")
		//, consumes = MediaType.APPLICATION_JSON_VALUE)		
		@ResponseBody		
//		public ResponseEntity<Object> addStatus(@RequestBody GroupCarrierVO request){
		public StatusVO addStatus(@RequestBody GroupCarrierVO request){
			
			StatusVO status = new StatusVO();
			try {
				status = statusService.getStatus(request);
				// reResponse is not the response we're looking for.
//				recResponse.setStatusResponse(statusVO);
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		
			
	
			
//			return new ResponseEntity<Object>(recResponse, HttpStatus.OK);
//			return recResponse;
			return status;
			
			
		}
		

}
