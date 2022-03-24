package application;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Map.Entry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SampleController implements Initializable{
	   @FXML
	   private Label label;
	   @FXML
	   private Button palinCheck;
	   @FXML
	   private TextField palinInput;
	   @FXML
	   private Label palinLabel;
	   @FXML
	   private ListView<String> randomList;

	   @FXML
	   private void handleButtonAction(ActionEvent event) throws IOException {
	      HashFunction check = new HashFunction();
	      String[] listOfEntry = (String[]) check.last20();
	      
	      randomList.getItems().addAll(listOfEntry);
	      
	      

	   }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
