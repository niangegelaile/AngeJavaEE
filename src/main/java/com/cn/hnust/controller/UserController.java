package com.cn.hnust.controller;

import java.util.List;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request,Model model){
		return "redirect:/user/listUser.do" ;
	}
	@RequestMapping("/listUser")
	public String listUser(HttpServletRequest request){
		List<User> list=userService.getAll();
		request.setAttribute("listUser", list);
		return "listUser";
	}
	@RequestMapping("/UIupdateUser")
	public String updateUserUI(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		User user=userService.getUserById(id);
		request.setAttribute("user",user);
		return "updateUser";
	}
	@RequestMapping("/updateUser")
	public String updateUser(User user){
		userService.updateUserById(user);
		
		return "redirect:/user/listUser.do";
	}
	@RequestMapping("/addUser")
	public String addUser(User user){
		userService.addUser(user);
		return "redirect:/user/listUser.do";
	}
	@RequestMapping("/UIaddUser")
	public String addUserUI(User user){
		return "addUser";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser(int id){
		userService.deleteUserById(id);
		return "redirect:/user/listUser.do";
	}
	
}
