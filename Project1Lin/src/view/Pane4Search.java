package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Pane4Search {

	private VBox pane;
	private Label searchById, searchByIsbn;
	private TextField searchIdField, searchByIsbnField;

	
	public Pane4Search() {

		pane = new VBox(10);
		
		searchById = new Label("Search By ID ");
		searchIdField = new TextField();

		searchByIsbn = new Label("Search By ISBN ");
		searchByIsbnField = new TextField();

		pane.getChildren().addAll(searchById, searchIdField, searchByIsbn, searchByIsbnField);

	}

	public String getId() {
		return searchIdField.getText();
	}

	public String getIsbn() {
		return searchByIsbnField.getText();
	}

	public Pane getPane() {
		return pane;
	}
	
	
}
