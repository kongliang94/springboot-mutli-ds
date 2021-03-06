package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
	@RequestMapping(value = "/api/user", method = RequestMethod.GET)
	public User findUserByName(@RequestParam(value="userName",required=true)String userName){
		
		return userService.findByName(userName);
	}
}
