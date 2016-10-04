package model;

import java.io.Serializable;

public class Textbook implements Serializable{
	private String title;
	private String name;
	private String isbn;
	private String publisher;
	private double price;
	private String yearPublished;

	public Textbook(String title, String name, String isbn, String publisher, double price, String yearPublished) {
		super();
		this.title = title;
		this.name = name;
		this.isbn = isbn;
		this.publisher = publisher;
		this.price = price;
		this.yearPublished = yearPublished;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(String yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "Textbook [title=" + title + ", name=" + name + ", isbn=" + isbn + ", publisher=" + publisher
				+ ", price=" + price + ", yearPublished=" + yearPublished + "]";
	}

}
