package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Pane4Faculty extends Pane4Person{

	private Label office;
	private Label title;
	private Label pay;
	private TextField officeField;
	private TextField titleField;
	private TextField payField;
	private VBox pane;
	
	public Pane4Faculty(){
		
		pane = new VBox(10);
		
		//creating labels and text fields.
		office = new Label("Office ");
		officeField = new TextField();
		title = new Label("Title ");
		titleField = new TextField();
		pay = new Label("Salary ");
		payField = new TextField();
		//adding node to scene
		pane.getChildren().addAll(office, officeField, title, titleField, pay, payField);
	}
	
	public String getOffice() {
		return officeField.getText();
	}

	public void setOffice(String office) {
		officeField.setText(office);
	}
	
	public String getTitle() {
		return titleField.getText();
	}

	public void setTitle(String title) {
		titleField.setText(title);
	}
	
	public int getPay() {
		return Integer.parseInt(payField.getText());
	}

	public void setPay(int pay) {
		officeField.setText(String.valueOf(pay));
	}
	
	public Pane getPane() {
		return pane;
	}
}
