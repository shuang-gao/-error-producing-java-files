package application;

import java.awt.event.ActionEvent;

/* import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane; */

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController {

	

    @FXML
    private ChoiceBox<?> myChoiceBox;
    
    @FXML
    private Label myLabel;

    @FXML
    private Button myButton;

    @FXML
    private PieChart myPieChart;

    @FXML
    private TextField myTextField;
        
    @FXML
    void reactToButtonClick(ActionEvent event) {
        myLabel.setText("button clicked");
    }
    
    @FXML
    void keyTyped(ActionEvent event) {
    	myLabel.setText(myTextField.getText());
    }
    
    @FXML
    void initialize() {
        assert myChoiceBox != null : "fx:id=\"myChoiceBox\" was not injected: check your FXML file 'WidgetDemoView.fxml'.";
        assert myLabel != null : "fx:id=\"myLabel\" was not injected: check your FXML file 'WidgetDemoView.fxml'.";
        assert myButton != null : "fx:id=\"myButton\" was not injected: check your FXML file 'WidgetDemoView.fxml'.";
        assert myPieChart != null : "fx:id=\"myPieChart\" was not injected: check your FXML file 'WidgetDemoView.fxml'.";
        assert myTextField != null : "fx:id=\"myTextField\" was not injected: check your FXML file 'WidgetDemoView.fxml'.";

    }

}
