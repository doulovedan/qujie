package com.jizhiwei.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jizhiwei.dao.AddressMapper;

@Service
public class AddressService {

	@Autowired
	AddressMapper mapper;

	public String getAddressById(String addId) {
		return mapper.selectByPrimaryKey(Integer.valueOf(addId)).toString();
	}

}
