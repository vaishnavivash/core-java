package com.xworkz.soldier.beann;

import com.xworkz.soldier.Repo.SoldierRepo;
import com.xworkz.soldier.dto.SoldierDto;
import com.xworkz.soldier.service.SoldierServiceimpl;

public class SoldierRunner {
	
	public static void main(String[] args) {
		SoldierDto dto = new SoldierDto("vaish",1,"Topper","xworkz","banglore");
		SoldierServiceimpl ser= new SoldierServiceimpl();
		SoldierRepo repo= new SoldierRepoimpl();
		ser.setSoldierRepo(repo);
		ser.save(dto);
	}

}



