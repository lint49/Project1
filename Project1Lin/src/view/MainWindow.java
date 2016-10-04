package view;

import java.io.IOException;
import java.io.Serializable;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Address;
import model.Course;
import model.Faculty;
import model.MasterCourseBag;
import model.PeopleBag;
import model.Student;
import model.Textbook;
import model.TextbookBag;

public class MainWindow extends Application implements Serializable {

	private Button ok, faculty, course, textbook, load, find;
	private String cNum, cName;
	private int cCredit;
	private String fname, lname, phone, major, office, title, stNum, stName, city, state, zip;
	private int credit, pay;
	private double gpa;
	private PeopleBag peopleBag;
	private MasterCourseBag master;
	private TextbookBag textbookBag;
	// for search
	private String id, bookIsbn;
	// textbook
	private String bookName, bookTitle, isbn, publisher, year;
	private double price;

	public void start(Stage stage) throws Exception {

		Pane4MainWindow pane4MainWindow = new Pane4MainWindow();

		Scene scene = new Scene(pane4MainWindow.getPane(), 600, 650);

		// buttons
		ok = pane4MainWindow.getOkBtn();
		course = pane4MainWindow.getCourseBtn();
		faculty = pane4MainWindow.getFacultyBtn();
		textbook = pane4MainWindow.getTextbookBtn();
		load = pane4MainWindow.getLoadkBtn();
		find = pane4MainWindow.getSearchkBtn();

		// bags
		peopleBag = new PeopleBag(100);
		master = new MasterCourseBag(100);
		textbookBag = new TextbookBag(100);

		// student button

		ok.setOnAction(e -> {

			fname = pane4MainWindow.getfName();
			lname = pane4MainWindow.getlName();
			phone = pane4MainWindow.getPhone();

			stNum = pane4MainWindow.getStNum();
			stName = pane4MainWindow.getStName();
			city = pane4MainWindow.getCity();
			state = pane4MainWindow.getState();
			zip = pane4MainWindow.getZip();

			gpa = pane4MainWindow.getGpa();
			major = pane4MainWindow.getMajor();
			credit = pane4MainWindow.getCredit();

			Address a = new Address(stNum, stName, city, state, zip);
			Student s = new Student(fname, lname, phone, a, gpa, major, null, null, null, credit);

			peopleBag.toString();
			peopleBag.add(s);

			try {
				peopleBag.save();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println(s);

		});

		// faculty button

		faculty.setOnAction(e2 -> {

			office = pane4MainWindow.getOffice();
			title = pane4MainWindow.getTitle();
			pay = pane4MainWindow.getPay();

			fname = pane4MainWindow.getfName();
			lname = pane4MainWindow.getlName();
			phone = pane4MainWindow.getPhone();

			stNum = pane4MainWindow.getStNum();
			stName = pane4MainWindow.getStName();
			city = pane4MainWindow.getCity();
			state = pane4MainWindow.getState();
			zip = pane4MainWindow.getZip();

			Address a = new Address(stNum, stName, city, state, zip);

			Faculty f = new Faculty(fname, lname, phone, a, office, title, pay);

			peopleBag.toString();
			peopleBag.add(f);

			try {
				peopleBag.save();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		// course button
		course.setOnAction(e3 -> {

			cNum = pane4MainWindow.getCourseNum();
			cName = pane4MainWindow.getCourseTitle();
			cCredit = pane4MainWindow.getCourseCredit();

			Course c = new Course(cName, cNum, null, cCredit);

			master.add(c);

			try {
				master.save();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		// textbook button
		textbook.setOnAction(e4 -> {

			bookName = pane4MainWindow.getName();
			bookTitle = pane4MainWindow.getCity();
			isbn = pane4MainWindow.getIsbn();
			publisher = pane4MainWindow.getPublisher();
			year = pane4MainWindow.getYear();
			price = pane4MainWindow.getPrice();

			Textbook t = new Textbook(bookTitle, bookName, isbn, publisher, price, year);

			textbookBag.add(t);

			try {
				textbookBag.save();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		// load button
		load.setOnAction(e5 -> {

			try {
				textbookBag.load();
				master.load();
				peopleBag.load();
			} catch (ClassNotFoundException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		});

		find.setOnAction(e6 -> {

			id = pane4MainWindow.getPersonId();
			peopleBag.findByID(id);

			bookIsbn = pane4MainWindow.getBookIsbn();
			textbookBag.findByIsbn(bookIsbn);

		});

		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();
	}

}
