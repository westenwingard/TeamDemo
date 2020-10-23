public class User {
private String name;
private boolean isPropertyManager;
private String password;

public User(String[] userInfo) {
this.name = userInfo[0];
this.password = userInfo[1];
if(userInfo[2].toLowerCase().equals("y"))
	this.isPropertyManager = true;
else
	this.isPropertyManager = false;
}
	public String toString(){
		return "Name: "+name+" Password: "+password+" isPropertuManager"+ isPropertyManager;
	}
}
