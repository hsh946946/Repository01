package cn.gzsxt.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gzsxt.ssm.domain.User;
import cn.gzsxt.ssm.mapper.UserMapper;
import cn.gzsxt.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		
		return userMapper.selectAll();
	}

	@Override
	public int deleteById(int id) {
				return userMapper.deleteById(id);
	}

	@Override
	public User selectUserByUsernameAndPassword(String username, String pwd) {
		
		return userMapper.selectUserByUsernameAndPassword(username, pwd);
	}

	



	

	

}
