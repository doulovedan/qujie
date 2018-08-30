package com.jizhiwei.service;

public interface IAddressService {

	String getAddressById(String addId);

	void insertAddress(String addArea, String addCity);

	int getAddressIdByCityName(String cityName);
}
