package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Pane4Course {
	
	private GridPane pane;
	//private Label courseTitle;
	private TextField courseTitleField;
	//private Label courseNum;
	private TextField courseNumField;
	//private Label credit;
	private TextField creditField;
	

	public Pane4Course(){
		
		pane = new GridPane();

		
		//creating label and text fields
		
		pane.add(new Label("Course Title "), 1,2);
		courseTitleField = new TextField();
		pane.add(courseTitleField, 1,3);
		
		pane.add(new Label("Course Number "), 3,2);
		courseNumField = new TextField();
		pane.add(courseNumField, 3,3);
		
		pane.add(new Label("Course Credit "), 2,4);
		creditField = new TextField();
		pane.add(creditField, 2,5);
		
	}
	
	public String getTitle() {
		return courseTitleField.getText();
	}
	
	public void setTitle(String title) {
		courseTitleField.setText(title);
	}
	
	public String getNum() {
		return courseNumField.getText();
	}
	
	public void setNum(String num) {
		courseNumField.setText(num);
	}
	
	public int getCredit() {
		return Integer.parseInt(creditField.getText());
	}
	
	public void setCredit(int credit) {
		creditField.setText(String.valueOf(credit));
	}
	
	public Pane getPane() {
		return pane;
	}

}
