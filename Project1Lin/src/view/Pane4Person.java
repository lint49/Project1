package view;

import java.util.Optional;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import model.ZipException;

public class Pane4Person {
	
	private VBox pane;
	private Label fName;
	private TextField fNameField;
	private Label lName;
	private TextField lNameField;
	private Label id;
	private TextField idField;
	private Label phone;
	private TextField phoneField;
	private Label stName;
	private TextField stNameField;
	private Label stNum;
	private TextField stNumField;
	private Label city;
	private TextField cityField;
	private Label state;
	//private TextField stateField;
	private Label zip;
	private TextField zipField;
	
	ComboBox <String> states;
	
	public Pane4Person(){
		pane = new VBox(10);
		
		//combo box for states
		
		states = new ComboBox<>();
		states.getItems().addAll("Alabama","Alaska","Arizona","Arkansas","California",
				"Colorado","Connecticut","Delaware","District of Columbia","Florida",
				"Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky",
				"Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi",
				"Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico",
				"New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania",
				"Rhode Island","South Carolina","South Dakota","Tennessee","Texas",
				"Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin",
			    "Wyoming"
				);
		
		//creating label and text fields
		
		fName = new Label("First Name ");
		fNameField = new TextField();
		
		lName = new Label("Last Name ");
		lNameField = new TextField();
		
		id = new Label("ID Number ");
		idField = new TextField();
		
		phone = new Label("Phone Number ");
		phoneField = new TextField();
		
		stNum = new Label("Street Number ");
		stNumField = new TextField();
		
		stName = new Label("Street Name ");
		stNameField = new TextField();
		
		city = new Label("City ");
		cityField = new TextField();
		
		state = new Label("State ");
		//stateField = new TextField();
		
		zip = new Label("Zip Code ");
		zipField = new TextField();
		
		idField.setEditable(false);
		pane.getChildren().addAll(fName,fNameField,lName,lNameField, id, idField,phone, phoneField,
								  stNum,stNumField,stName,stNameField,city,cityField,state,states,
								  zip,zipField);
		
	}
	
	public String getId() {
		return idField.getText();
	}
	
	public String getfName() {
		return fNameField.getText();
	}
	
	public void setfName(String fname) {
		fNameField.setText(fname);
	}
	
	public String getlName() {
		return lNameField.getText();
	}
	
	public void setlName(String lname) {
		lNameField.setText(lname);
	}
	
	public String getPhone() {
		return phoneField.getText();
	}
	
	public void setPhone(String phone) {
		phoneField.setText(phone);
	}

	public String getStNum() {
		return stNumField.getText();
	}
	
	public void setStNum(String stNum) {
		stNumField.setText(stNum);
	}
	
	public String getStName() {
		return stNameField.getText();
	}
	
	public void setStName(String stName) {
		stNameField.setText(stName);
	}
	
	public String getCity() {
		return cityField.getText();
	}
	
	public void setCity(String city) {
		cityField.setText(city);
	}
	
	public String getState() {
		return states.getValue();
	}
	
	//public void setState(String state) {
	//	states.setText(state);
	//}
	
	public String getZip() {
		return zipField.getText();
	}
	
	public void setZip(String zip) {
		for(int i = 0; i < zip.length(); i++) {
			if(!Character.isDigit(zip.charAt(i))){
				
				TextInputDialog dialog = new TextInputDialog();
				dialog.setTitle("DATA INPUT ERROR");
				dialog.setHeaderText("Wrong Zip: Must Be 5 Digits");
				dialog.setContentText("Enter The Right Zip ");
				
				//Optional<String> result zip = dialog.showAndWait();
			}
			else{
				zipField.setText(zip);
			}
		}
	}
	
	public Pane getPane() {
		return pane;
	}

}
