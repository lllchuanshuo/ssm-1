package com.demo.ssm.test;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/spring-core.xml", "classpath:conf/spring-mybatis.xml" })
public class UserServiceTestCase {
	private static final Logger LOGGER = Logger.getLogger(UserServiceTestCase.class);

	@Autowired
	private UserService userService;

	@Test
	public final void testDeleteByPrimaryKey() {
		userService.deleteByPrimaryKey(new Integer(1));
	}

	@Test
	public final void testInsert() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testInsertSelective() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testSelectByPrimaryKey() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateByPrimaryKeySelective() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testUpdateByPrimaryKey() {
		fail("Not yet implemented"); // TODO
	}

}
