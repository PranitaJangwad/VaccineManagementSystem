package com.vms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vms.entity.IdCard;
import com.vms.exception.RecordNotFound;
import com.vms.repository.IdCardRepository;
import com.vms.service.IdCardService;


@Service("IdCardService")
public class IdCardServiceImpl implements IdCardService{
	
	@Autowired
	IdCardRepository idCardRepository;

	@Override
	public IdCard addIdCard(IdCard idCard) throws RecordNotFound {
		IdCard save = idCardRepository.save(idCard);
		return save;
	}

	@Override
	public IdCard getIdByMobile(long mobNo) throws RecordNotFound {
		IdCard  bean = null;
		bean=idCardRepository.findByMobNo(mobNo);
		if(bean==null)
			throw new RecordNotFound("Id Card details not found!");
		System.out.println(bean);
		return bean;
	}

	@Override
	public IdCard getIdByAadhar(String aadharNo) throws RecordNotFound {
		IdCard  bean = null;
		bean=idCardRepository.findByAadharNo(aadharNo);
		if(bean==null)
			throw new RecordNotFound("Id Card details not found!");
		return bean;
	}

	@Override
	public List<IdCard> getAllCards() {
		// TODO Auto-generated method stub
		return idCardRepository.findAll();
	}
}