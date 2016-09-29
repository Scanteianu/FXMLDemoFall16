/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmldemofall16;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Dan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    TextArea area;
    @FXML
    TextField index;
    @FXML
    TextField input;
    ArrayList<String> myList=FXMLDemoFall16.getMyList();
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private void insert(ActionEvent event) {
        String myIndex=index.getText();
        String myInput=input.getText();
        try{
            int theIndex=Integer.parseInt(myIndex);
            myList.add(theIndex,myInput);
            
        }
        catch(Exception e){
            myList.add(myInput);
        }
        
        
        refresh();
    }
    private void refresh(){
        String wholeList="";
        for(String item : myList)
           wholeList+=item+"\n";
        area.setText(wholeList);
        input.setText("");
        index.setText("");
    }
    @FXML
    private void delete(ActionEvent event) {
        String myIndex=index.getText();
        try{
            int theIndex=Integer.parseInt(myIndex);
            myList.remove(theIndex);
            
        }
        catch(Exception e){
            Alert alert = new Alert(AlertType.ERROR, "Hey. That's not a number. Why don't you try again?", ButtonType.OK);
            alert.showAndWait();

            
        }
        refresh();
    }
     @FXML
    private void size(ActionEvent event) {
        try {
            Stage secondStage=new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("SecondWindow.fxml"));
            secondStage.setTitle("Size");
            secondStage.setScene(new Scene(root));
            secondStage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
