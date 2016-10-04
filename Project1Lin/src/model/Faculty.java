package model;

import java.io.Serializable;

public class Faculty extends Person implements Serializable{

	private String office;
	private String title;
	private int pay;
	
	public Faculty(String fName, String lName, String phone, Address address, String office, String title, int pay) {
		super(fName, lName, phone, address);
		this.office = office;
		this.title = title;
		this.pay = pay;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) throws PayRateException {
		if(pay >=0 && pay<= 10){
			this.pay = pay;
		}
		else{
			throw new PayRateException("Enter Pay Rate Must Be Between 0 to 10");
		}
	}

	@Override
	public String toString() {
		return "Faculty [office=" + office + ", title=" + title + ", pay=" + pay + "]";
	}
	
}
