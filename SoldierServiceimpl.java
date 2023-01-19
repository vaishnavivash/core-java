package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.bind.Validator;

import com.xworkz.soldier.Repo.SoldierRepo;
import com.xworkz.soldier.dto.SoldierDto;

public class SoldierServiceimpl {
private SoldierRepo soliderrepo;
	
	public SoldierServiceimpl() {

		System.out.println("Created SoliderServiceImpl using no-org const..");
	}
	public void setSoliderRepo(SoldierRepo soliderrepo) {
		this.soliderrepo =soliderrepo;
	}
	

	public boolean save(SoldierDto dto) {
		System.out.println("starting validateAndSave");
		System.out.println("dto passed:"+dto);
	ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
	javax.validation.Validator validator=factory.getValidator();
	Set<ConstraintViolation<SoldierDto>> violations=validator.validate(dto);
	if(!violations.isEmpty()) {
		System.err.println("There are validation errors..");
		
		
		violations.forEach(v ->{
			System.err.println("violating message"+v.getMessage());
			
		}
		);
		return false;
		
	}
	else {
		System.out.println("Data is valid...");
		return true;
	}
	
	}
	
	

}
