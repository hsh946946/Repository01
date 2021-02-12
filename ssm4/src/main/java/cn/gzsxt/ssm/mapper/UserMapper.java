package cn.gzsxt.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.gzsxt.ssm.domain.User;

public interface UserMapper{
	
	@Select("select * from user where name=#{name} and password=#{password}")
	User selectUserByUsernameAndPassword(@Param("name")String username,@Param("password")String pwd);
	
	@Select("select * from user")
//	@Results(value = {
//	@Result(),
//	@Result(),
//	})
	List<User> selectAll();
	
	@Delete("delete from user where id=#{id}")
	int deleteById(int id);

}
