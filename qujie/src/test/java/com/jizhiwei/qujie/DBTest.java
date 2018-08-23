package com.jizhiwei.qujie;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jizhiwei.dao.DepartmentMapper;
import com.jizhiwei.dao.EmployeeMapper;
import com.jizhiwei.entity.Department;
import com.jizhiwei.entity.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class DBTest {
	
	@Autowired
	DepartmentMapper mapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Test
	public void test() {
		Department employee=new Department();
		mapper=	sqlSession.getMapper(DepartmentMapper.class);
	Department department=	mapper.selectByPrimaryKey(1);
	System.out.println(department.toString());
	}

}
