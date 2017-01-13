package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.model.User;
import test.serviceImpl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl us;
	
	@RequestMapping(value="cadastrar",method=RequestMethod.POST)
	public String addUser(User user){
		us.create(user);
		return "ok";
	}
}
