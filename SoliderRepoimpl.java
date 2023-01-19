package com.xworkz.soldier.Repo;

import com.xworkz.soldier.dto.SoldierDto;

public class SoliderRepoimpl implements SoldierRepo {
	
	
	public void SoliderRepoImpl() {
		System.out.println(" created SoliderRepoImpl using no-org const...");
	}
	@Override
	public boolean save(SoldierDto dto) {
		System.out.println("running save");
		System.out.println("DTO"+dto);
		return false;
		
	}
	
}


