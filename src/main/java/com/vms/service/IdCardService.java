package com.vms.service;

import java.util.List;

import com.vms.entity.IdCard;
import com.vms.exception.RecordNotFound;

public interface IdCardService {
	
	public IdCard addIdCard(IdCard idCard) throws RecordNotFound;
	public IdCard getIdByMobile(long mobNo) throws RecordNotFound;
	public IdCard getIdByAadhar(String aadharNo) throws RecordNotFound;
	public List<IdCard> getAllCards();
}
