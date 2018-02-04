package demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.domain.User;
import demo.repo.UserRepo;

@RestController
public class UsersController {
	
	@Autowired
	UserRepo userRepo;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/users/get")
	@ResponseBody
	public List<User> getUsers(@RequestParam("id") int id){
		
		User juhi = new User();
		juhi.setId(id);
		juhi.setName("Akansha Sharma");
		juhi.setAddress("207 lig");
		juhi.setAadharnumber("8888-9999-00000");
		userRepo.save(juhi);
		return userRepo.findAll();
//		return userDao.getUserList();
	}

}
