package view;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class Pane4MainWindow {

	private Pane4Person pane4Person;
	private Pane4Student pane4Student;
	private Pane4Buttons pane4Buttons;
	private Pane4Faculty pane4Faculty;
	private Pane4Course pane4Course;
	private Pane4TextBook pane4Textbook;
	private Pane4Search pane4Search;
	private BorderPane pane;

	public Pane4MainWindow() {

		pane4Buttons = new Pane4Buttons();
		pane4Person = new Pane4Person();
		pane4Student = new Pane4Student();
		pane4Faculty = new Pane4Faculty();
		pane4Course = new Pane4Course();
		pane4Textbook = new Pane4TextBook();
		pane4Search = new Pane4Search();
		pane = new BorderPane();

		// menu
		Menu menu = new Menu("New ");
		Menu menu2 = new Menu("Load ");
		Menu menu3 = new Menu("Search ");
		// student menu item
		MenuItem newStudent = new MenuItem("Student ");
		newStudent.setOnAction(e -> {

			pane.setLeft(pane4Person.getPane());
			pane.setRight(pane4Student.getPane());
			pane.setBottom(pane4Buttons.getButton());

		});
		// faculty menu item
		MenuItem newFaculty = new MenuItem("Faculty ");
		newFaculty.setOnAction(e -> {

			pane.setLeft(pane4Person.getPane());
			pane.setRight(pane4Faculty.getPane());
			pane.setBottom(pane4Buttons.getFacultyButton());

		});

		// Textbook menu item
		MenuItem newTextbook = new MenuItem("TextBook ");
		newTextbook.setOnAction(e -> {

			pane.setLeft(pane4Textbook.getPane());
			pane.setBottom(pane4Buttons.getTextbookButton());
		});

		// course menu item
		MenuItem newCourse = new MenuItem("Course ");
		newCourse.setOnAction(e -> {

			pane.setLeft(pane4Course.getPane());
			pane.setBottom(pane4Buttons.getCourseButton());

		});

		// menu item for loading
		MenuItem load = new MenuItem("Load All ");
		load.setOnAction(e -> {

			pane.setLeft(pane4Buttons.getLoadButton());
		});

		// menu item for search
		MenuItem search = new MenuItem("Find ");

		search.setOnAction(e -> {

			pane.setLeft(pane4Search.getPane());
			pane.setBottom(pane4Buttons.getFindButton());

		});

		MenuBar mbar = new MenuBar();

		mbar.getMenus().addAll(menu, menu2, menu3);

		menu.getItems().addAll(newCourse, newFaculty, newStudent, newTextbook);
		menu2.getItems().addAll(load);
		menu3.getItems().add(search);

		pane.setTop(mbar);

	}

	// person
	public String getfName() {
		return pane4Person.getfName();
	}

	public String getlName() {
		return pane4Person.getlName();
	}

	public String getId() {
		return pane4Person.getId();
	}

	public String getPhone() {
		return pane4Person.getPhone();
	}

	public String getStNum() {
		return pane4Person.getStNum();
	}

	public String getStName() {
		return pane4Person.getStName();
	}

	public String getCity() {
		return pane4Person.getCity();
	}

	public String getState() {
		return pane4Person.getState();
	}

	public String getZip() {
		return pane4Person.getZip();
	}

	// student
	public double getGpa() {
		return pane4Student.getGpa();
	}

	public String getMajor() {
		return pane4Student.getMajor();
	}

	public int getCredit() {
		return pane4Student.getCredit();
	}

	// faculty
	public String getOffice() {
		return pane4Faculty.getOffice();
	}

	public String getTitle() {
		return pane4Faculty.getTitle();
	}

	public int getPay() {
		return pane4Faculty.getPay();
	}

	// course
	public String getCourseTitle() {
		return pane4Course.getTitle();
	}

	public String getCourseNum() {
		return pane4Course.getNum();
	}

	public int getCourseCredit() {
		return pane4Course.getCredit();
	}

	// textbook
	public String getName() {
		return pane4Textbook.getName();
	}

	public String getBookTitle() {
		return pane4Textbook.getTitle();
	}

	public String getIsbn() {
		return pane4Textbook.getIsbn();
	}

	public String getPublisher() {
		return pane4Textbook.getPublisher();
	}

	public double getPrice() {
		return pane4Textbook.getPrice();
	}

	public String getYear() {
		return pane4Textbook.getYear();
	}

	// Search

	public String getPersonId() {
		return pane4Search.getId();
	}

	public String getBookIsbn() {
		return pane4Search.getIsbn();
	}

	// button for entering student, faculty, course, textbook, load, search
	public Button getOkBtn() {
		return pane4Buttons.getButton();
	}

	public Button getCourseBtn() {
		return pane4Buttons.getCourseButton();
	}

	public Button getFacultyBtn() {
		return pane4Buttons.getFacultyButton();
	}

	public Button getTextbookBtn() {
		return pane4Buttons.getTextbookButton();
	}

	public Button getLoadkBtn() {
		return pane4Buttons.getLoadButton();
	}

	public Button getSearchkBtn() {
		return pane4Buttons.getFindButton();
	}

	public Pane getPane() {
		return pane;
	}

}
