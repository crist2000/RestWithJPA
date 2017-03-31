package some.domain.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	
	String id;
	String fname;
	String lname;
	int age;
	
	public User() {
	}

	public User(String id, String fname, String lname, int age) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}
