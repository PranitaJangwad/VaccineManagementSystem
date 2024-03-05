package com.vms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vms.entity.Admin;
import com.vms.service.AdminService;

@SpringBootApplication
public class VaccineManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccineManagementSystemApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(AdminService srv) {
	    return (args) -> {
    		Admin user=new Admin();
    		user.setUserid("admin123");
    		user.setPwd("pass123");
    		user.setUname("Administrator");
    		srv.register(user);	    		
	    };
	}

}
