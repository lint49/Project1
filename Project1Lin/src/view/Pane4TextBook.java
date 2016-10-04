package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Pane4TextBook {

	private GridPane pane;
	private TextField titleField;
	private TextField authorNameField;
	private TextField isbnField;
	private TextField publisherField;
	private TextField priceField;
	private TextField yearPublishedField;

	public Pane4TextBook() {

		pane = new GridPane();

		pane.add(new Label("Textbook"), 1, 4);

		pane.add(new Label("Title "), 1, 5);
		titleField = new TextField();
		pane.add(titleField, 1, 6);

		pane.add(new Label("Author Name "), 1, 7);
		authorNameField = new TextField();
		pane.add(authorNameField, 1, 8);

		pane.add(new Label("ISBN "), 1, 9);
		isbnField = new TextField();
		pane.add(isbnField, 1, 10);

		pane.add(new Label("Publisher "), 2, 5);
		publisherField = new TextField();
		pane.add(publisherField, 2, 6);

		pane.add(new Label("Price "), 2, 7);
		priceField = new TextField();
		pane.add(priceField, 2, 8);

		pane.add(new Label("Year Published "), 2, 9);
		yearPublishedField = new TextField();
		pane.add(yearPublishedField, 2, 10);

	}

	public String getTitle() {
		return titleField.getText();
	}

	public void setTitle(String title) {
		titleField.setText(title);
	}

	public String getName() {
		return authorNameField.getText();
	}

	public void setName(String name) {
		authorNameField.setText(name);
	}

	public String getIsbn() {
		return isbnField.getText();
	}

	public void setIsbn(String isbn) {
		isbnField.setText(isbn);
	}

	public String getPublisher() {
		return publisherField.getText();
	}

	public void setPublisher(String publisher) {
		publisherField.setText(publisher);
	}

	public double getPrice() {
		return Double.parseDouble(priceField.getText());
	}

	public void setPrice(double price) {
		priceField.setText(String.valueOf(price));
	}

	public String getYear() {
		return yearPublishedField.getText();
	}

	public void setYear(String year) {
		yearPublishedField.setText(year);
	}

	public Pane getPane() {
		return pane;
	}

}
