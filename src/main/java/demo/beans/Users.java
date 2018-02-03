package demo.beans;

import java.util.ArrayList;

public class Users {
	private ArrayList<User> userlist = new ArrayList<User>();

	public ArrayList<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(User user) {
		this.userlist.add(user);
	}
}
