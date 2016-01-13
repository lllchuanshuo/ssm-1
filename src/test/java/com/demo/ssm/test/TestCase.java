package com.demo.ssm.test;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.ssm.model.Operator;
import com.demo.ssm.service.OperatorService;

public class TestCase {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring-core.xml", "classpath:conf/spring-mybatis.xml" });
		OperatorService operatorService = (OperatorService)act.getBean("operatorService");
		Operator operator = new Operator();
		operator.setName("张三");
		operator.setUsername("zhangsan");
		operator.setPassword("123456");
		operator.setAddress("九堡");
		operator.setSex("男");
		operator.setBirthday(new Date());
		operator.setSal(new BigDecimal(111));
		operatorService.insert(operator);
	}

}
