package com.jizhiwei.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jizhiwei.dao.AddressMapper;
import com.jizhiwei.entity.Address;
import com.jizhiwei.entity.AddressExample;
import com.jizhiwei.entity.AddressExample.Criteria;
import com.jizhiwei.service.IAddressService;

@Service
public class AddressService implements IAddressService {

	@Autowired
	AddressMapper mapper;

	@Override
	public String getAddressById(String addId) {
		return mapper.selectByPrimaryKey(Integer.valueOf(addId)).toString();
	}

	@Override
	public void insertAddress(String addArea, String addCity) {
		Address address = new Address();
		address.setAddArea(addArea);
		address.setAddCity(addCity);
		mapper.insert(address);
	}

	@Override
	public int getAddressIdByCityName(String cityName) {
		AddressExample example = new AddressExample();
		Criteria criteria = example.createCriteria();
		criteria.andAddCityEqualTo(cityName);
		List<Address> addresses = mapper.selectByExample(example);
		if (addresses != null && addresses.size() > 0) {
			return addresses.get(0).getAddId();

		}
		return -1;
	}

}
