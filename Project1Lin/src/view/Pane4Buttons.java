package view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Pane4Buttons {

	private Button course;
	private Button ok;
	private Button faculty;
	private Button textbook;
	private Button load;
	private Button find;
	private HBox pane;

	public Pane4Buttons() {

		pane = new HBox(20);
		ok = new Button("Enter Student ");

		course = new Button("Enter Course ");
		faculty = new Button("Enter Faculty ");
		textbook = new Button("Enter Textbook ");
		load = new Button("Load All ");
		find = new Button("Find ");

		pane.getChildren().addAll(ok, course, textbook, load, find);
	}

	public Pane getPane() {
		return pane;
	}

	public Button getButton() {
		return ok;
	}

	public Button getCourseButton() {
		return course;
	}

	public Button getFacultyButton() {
		return faculty;
	}

	public Button getTextbookButton() {
		return textbook;
	}

	public Button getFindButton() {
		return find;
	}

	public Button getLoadButton() {
		return load;
	}

}
