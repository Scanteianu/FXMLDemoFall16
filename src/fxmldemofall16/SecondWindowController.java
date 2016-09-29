package fxmldemofall16;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Dan
 */
public class SecondWindowController implements Initializable {
    @FXML
    Label label1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    @FXML
    public void setLabel(ActionEvent event){
     label1.setText("The Size of your array is: "+FXMLDemoFall16.getMyList().size());
    }
    
}
