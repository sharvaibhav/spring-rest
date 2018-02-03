package demo.dao;

import java.util.ArrayList;

import demo.beans.User;
import demo.beans.Users;

public class UserDao {
	
	private  Users users = new Users();
	
	private void stuffdataIntoUsers(){
		
		User user1 = createUser("Vaibhav",1,"234342342343");
		User user2 = createUser("Abhinav",2,"56756757");
		User user3 = createUser("Saurabh",3,"43435435");
		User user4 = createUser("kapil",4,"434");
		User user5 = createUser("Sachin",5,"3456456464");
		
		this.users.setUserlist(user1);
		this.users.setUserlist(user2);
		this.users.setUserlist(user3);
		this.users.setUserlist(user4);
		this.users.setUserlist(user5);
	}
	
	private User createUser(String name,int id,String phNo){
		User user = new User(name,id,phNo,"","","","");
		return user;
		
	}
	
	public Users getUserList(){
		stuffdataIntoUsers();
		return this.users;
	}
	

	
}
