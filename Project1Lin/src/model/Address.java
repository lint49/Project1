package model;

import java.io.Serializable;

import javax.swing.JOptionPane;

public class Address implements Serializable{
	
	private String stNum;
	private String stName;
	private String city;
	private String state;
	private String zip;

	public Address(String stNum, String stName, String city, String state, String zip) {
		this.stNum = stNum;
		this.stName = stName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Address() {
		this("","","","","");
	}

	public String getStNum() {
		return stNum;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) throws ZipException {
		
		for(int i = 0; i < zip.length(); i++) {
		if(!Character.isDigit(zip.charAt(i)))
			throw new ZipException("The zip is not all digits");
		}

		if (zip.length() != 5) {
				try {
					throw new ZipException("Error: The zip is not five characters");
				} catch (ZipException e) {
					zip = JOptionPane.showInputDialog(e.getMessage() + "\nEnter a correct Zip");
				}
			} else {
				this.zip = zip;
			}
	}

	@Override
	public String toString() {
		return "Address: " + stNum + " " + stName + " \n         " + city + " " + state + " " + zip
				+ "";
	}
	

}
