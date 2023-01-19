package com.xworkz.soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public  abstract class abstractAudiDto implements Serializable {
	

	private String createdby;
	private LocalDateTime createdAt;
	private String updateby;
	private LocalDateTime updateAt;
	
	
	

}
