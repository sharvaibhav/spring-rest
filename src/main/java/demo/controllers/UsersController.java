package demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.beans.Users;
import demo.dao.UserDao;

@RestController
public class UsersController {
	@RequestMapping("/users/get")
	public Users getUsers(){
		UserDao userDao = new UserDao();
		return userDao.getUserList();
	}

}
