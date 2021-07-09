package com.galaxe.orch.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChannelSelectionResponse {
	
	List<Email> email;
	List<Phone> phone;

}
