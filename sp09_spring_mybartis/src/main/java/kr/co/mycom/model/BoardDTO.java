package kr.co.mycom.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {		// model
	private int num, hit, parent, sort, tab;
	private String name, email, pwd, subject, content;
	private Date regdate;
	
}
