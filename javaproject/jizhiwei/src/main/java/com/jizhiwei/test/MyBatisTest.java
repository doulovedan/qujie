package com.jizhiwei.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jizhiwei.dao.AddressMapper;
import com.jizhiwei.entity.Address;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MyBatisTest {

	// @Autowired
	AddressMapper mapper;

	@Autowired
	SqlSession sqlSession;

	@Test
	public void testDB() {
		mapper = sqlSession.getMapper(AddressMapper.class);
		Address address = mapper.selectByPrimaryKey(1);
		System.out.println(address.toString());
	}
}
