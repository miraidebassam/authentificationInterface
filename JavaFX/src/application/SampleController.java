package application;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

@SuppressWarnings("unused")
public class SampleController implements Initializable{
	
	@FXML
    private TextField txtLogin;

    @FXML
    private Button txtConnecte;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnQuitter;
   
    @FXML
    public void handleActionConnecter(ActionEvent e){
        	String username = txtLogin.getText();
        	String password = txtPassword.getText();
        	if (username.isEmpty()||password.isEmpty() ) {
        		//System.out.println("Veillez remplir tous les champs!");
        		Alert dialogW = new Alert(AlertType.WARNING);
        		dialogW.setTitle("Avertissement");
        		dialogW.setHeaderText(null); // No header
        		dialogW.setContentText("Veillez remplir tous les champs!");
        		dialogW.showAndWait();
        	}else {
    			System.out.println("Connection reussit !");
    		}
    }
    
	@FXML
    public void handleActionClear(ActionEvent e){
    	txtLogin.setText(null);
    	txtPassword.setText(null);
    }
    
    @FXML
    public void handleActionQuitter(ActionEvent e){
    	Alert dialogC = new Alert(AlertType.CONFIRMATION);
    	dialogC.setTitle("Confirmation");
    	dialogC.setHeaderText(null);
    	dialogC.setContentText("Voulez vous vraiment quitter?");
    	Optional<ButtonType> answer = dialogC.showAndWait();
    	if (answer.get() == ButtonType.OK) {
    	  Main.getStage().hide();
    	}
    	else {
    	System.out.println("User chose Cancel or closed the dialog-box");
    	}
    	
    }
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			 System.out.println("hello");
		} catch (IllegalArgumentException e) {
			System.err.print("echec");
		}
          
	}

}
