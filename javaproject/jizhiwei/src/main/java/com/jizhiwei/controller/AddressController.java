package com.jizhiwei.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jizhiwei.common.Result;
import com.jizhiwei.service.IAddressService;

@RequestMapping("/address")
@Controller
public class AddressController {

	Logger log = Logger.getLogger(AddressController.class);

	@Autowired
	IAddressService addressService;

	@ResponseBody
	@RequestMapping("/getAddressById")
	public String getAddressById(@RequestParam("addId") String addId) {
		return addressService.getAddressById(addId);
	}

	@ResponseBody
	@RequestMapping("/addAddress")
	public Result insertAddress(@RequestParam("addArea") String addArea, @RequestParam("addCity") String addCity) {

		try {
			addressService.insertAddress(addArea, addCity);
			return Result.Success("添加地址成功");
		} catch (Exception e) {
			log.error(e.toString());
			return Result.Fail("添加地址失败");
		}
	}
}
