package cn.gzsxt.ssm.service;

import java.util.List;

import cn.gzsxt.ssm.domain.User;

public interface UserService {
	
	User selectUserByUsernameAndPassword(String username,String pwd);
	List<User> selectAll();
	int deleteById(int id);

}
