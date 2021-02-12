package cn.gzsxt.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gzsxt.ssm.domain.User;
import cn.gzsxt.ssm.service.UserService;
import cn.gzsxt.ssm.vo.Message;

@Controller
@RequestMapping("/User")
@Scope("singleton")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("login")
	public String login000(String username,String pwd,HttpServletRequest request,HttpServletResponse response) {
		System.out.println("我进来了O");
		User user=userService.selectUserByUsernameAndPassword(username, pwd);
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		if(user!=null) {
			return "forward:list.do";
		}else {
			return "redirect:/login.jsp";
		}
	}

	@RequestMapping("/list")
	public String getUserList(Model model) {
		List<User> list = userService.selectAll();
		model.addAttribute("userlist", list);
		return "userlist";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public Message deleteById(int uid) {
		System.out.println("我是delete");
		int flag = userService.deleteById(uid);
		if (flag == 1) {
			Message message = new Message(1, "删除成功");
			return message;
		} else {
			Message message = new Message(2, "删除失败");
			return message;
		}

	}
}
