package cn.gzsxt.ssm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.gzsxt.ssm.domain.User;
import cn.gzsxt.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring.xml"})
public class UserMapperTest {
	@Autowired
	private UserService userService;

	@Test
	public void testSelectAll() {
		List<User> list=userService.selectAll();
		System.out.println(list);
	}

}
