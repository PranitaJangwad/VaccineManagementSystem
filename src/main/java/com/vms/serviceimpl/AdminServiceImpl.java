package com.vms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.dto.LoginDTO;
import com.vms.entity.Admin;
import com.vms.repository.AdminRepository;
import com.vms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired private AdminRepository repo;
	
	@Override
	public Admin validate(LoginDTO dto) {
		Admin admin=repo.findById(dto.getUserId()).orElse(null);
			if(admin!=null && admin.getPwd().equals(dto.getPwd()))
				return admin;
		return null;
	}

	@Override
	public void register(Admin admin) {
		if(repo.count()==0)  
			repo.save(admin);  
	}
	
}