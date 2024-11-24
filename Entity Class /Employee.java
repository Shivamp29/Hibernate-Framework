/*

    Entity class Example 
    
*/

// defining ' Employee ' class which represents a table in database
public class Employee {

	// defining private fields which represents a Attributes or columns of Employee Table
	private int id ;
	private String name;
	private long phone ;
	private String dsgn;
	private double salary;
	private String email;
	private String password;

	// writing getters & setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

  // overriding the toString() method
	@Override
	public String toString() {
		return " Employee [ id : "+id+" , Name : "+name+" , Phone : "+phone+" , Desg : "+dsgn+" , salary : "+salary+" , Email : "+email+" , Password : "+password+" ]";
	}
}


