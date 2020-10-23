import java.util.ArrayList;

public class Users {
	private static Users users;
	private static ArrayList<User> userList = new ArrayList<User>();
	
	private Users() {
		userList = UserLoader.loadUsers();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}

	public static ArrayList<User> getUser() {
		return userList;
	}

	public void addUser(String name, String password, boolean isManager) {
		userList.add(new User(name, password, isManager));
		UserWriter.saveUser();
	}

}
