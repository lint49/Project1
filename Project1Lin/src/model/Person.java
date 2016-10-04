package model;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String fName;
	private String lName;
    private String id;
	private String phone;
	private Address address;
	private static int idInt = 0;
	
	public Person(){
		
	}
	
	public Person(String fName, String lName, String phone, Address address) {
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.address = address;
		id = String.valueOf(idInt++);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;

	}

	@Override
	public String toString() {
		return "Name: " + fName +" "+ lName + "\nID: " + id + "\nPhone: " + phone
				+"\n"+ getAddress() + "";
	}


}
