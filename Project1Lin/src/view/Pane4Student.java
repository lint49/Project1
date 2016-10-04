package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Pane4Student extends Pane4Person {

	private VBox pane;
	private Label gpa;
	private TextField gpaField;
	private Label major;
	private TextField majorField;
	private Label credit;
	private TextField creditField;

	public Pane4Student() {
		pane = new VBox(10);

		gpa = new Label("GPA ");
		gpaField = new TextField();

		major = new Label("Major ");
		majorField = new TextField();

		credit = new Label("Credit ");
		creditField = new TextField();

		pane.getChildren().addAll(gpa, gpaField, major, majorField, credit, creditField);
	}

	public double getGpa() {
		return Double.parseDouble(gpaField.getText());
	}

	public void setGpa(double gpa) {
		if (gpa >= 0 && gpa <= 4) {
			gpaField.setText(String.valueOf(gpa));
		} else {

			TextInputDialog dialog = new TextInputDialog();
			dialog.setTitle("DATA INPUT ERROR");
			dialog.setHeaderText("Wrong GPA: Must Be Between 0 - 4.");
			dialog.setContentText("Enter The Right GPA ");

		}
	}

	public String getMajor() {
		return majorField.getText();
	}

	public void setMajor(String major) {
		majorField.setText(major);
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
