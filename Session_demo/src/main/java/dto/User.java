package dto;

public class User {
	private String fname;
	private String lname;
	private String email;
	private int age;
	private long contact;
	private String state;
	
 public User() {
		
	}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}



public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public long getContact() {
	return contact;
}

public void setContact(long n) {
	this.contact = n;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}
public String toString() {
	return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", age=" + age + ", contact=" + contact
			+ ", state=" + state + "]";
}

}
