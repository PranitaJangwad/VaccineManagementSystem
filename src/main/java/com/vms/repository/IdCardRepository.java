package com.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vms.entity.IdCard;

@Repository
public interface IdCardRepository extends JpaRepository<IdCard,Integer>{ 
	IdCard findByMobNo(long mobile);

	@Query(nativeQuery = true, value = "select * from id_card where  aadhar_no=?1")
	IdCard findByAadharNo(String aadhar);
}