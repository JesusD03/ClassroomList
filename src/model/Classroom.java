package model;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	
	private List<UserAccount> users;

	public Classroom() {
		users = new ArrayList <UserAccount>();
	}
	
	public boolean add(String username, String password, String photo, String gender, String carrer, String birthday,
			String browser) {
		UserAccount newUser = new UserAccount(username, password, photo, gender, carrer, birthday, browser);
		if (users.add(newUser)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int findUser(String name, String password) {
		int account = -1;
		boolean find = false;
		for(int i=0; i<users.size() && !find; i++ ) {
			if(users.get(i).getUsername().equals(name) && users.get(i).getUsername().equals(password)) {
				account = i;
				find = true;
			}
		}
		return account;
	}

	public boolean remove(int index) {
		return true;
	}

	public List<UserAccount> getUsers() {
		return users;
	}
	
}
