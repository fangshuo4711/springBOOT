package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.UserRepository;
import com.spring.entity.User;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/list")
	public List<User> getAll(){
		
		return userRepository.findAll();
		
	}
	
	@RequestMapping("/id/{1}")
	public User getUserById(@PathVariable("id")Integer id){
		return userRepository.findOne(id);
	}
	
	 @RequestMapping(value = "/account", method = RequestMethod.POST)
	    public String postAccount(@RequestParam(value = "loginName") String loginName,
	                              @RequestParam(value = "loginPwd") String loginPwd) {
	        User user=new User();
	        user.setLoginName(loginName);
	        user.setLoginPwd(loginPwd);
	        User user1 = userRepository.save(user);
	        return user1.toString();

	    }
}
