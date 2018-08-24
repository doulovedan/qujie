package com.jizhiwei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jizhiwei.serviceimp.AddressService;

@RequestMapping("/address")
@Controller
public class AddressController {

	@Autowired
	AddressService addressService;

	@ResponseBody
	@RequestMapping("/getAddressById")
	public String getAddressById(@RequestParam("addId") String addId) {
		return addressService.getAddressById(addId);
	}
}
