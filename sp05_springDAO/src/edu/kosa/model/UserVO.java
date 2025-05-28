package edu.kosa.model;

import lombok.Data;

@Data
public class UserVO {
	private String id, name, password;
	
	// setter method --> DI
}
