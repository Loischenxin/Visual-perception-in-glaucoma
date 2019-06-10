/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ophthamology;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author mac
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Angie
 */
public class TestPageController implements Initializable , ControlledScreen {

    ScreensController myController;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    @FXML
    private void goToHomepage(ActionEvent event){
       myController.setScreen(ScreensFramework.HomePageScreenId);
    }
    
     @FXML
    private void goToBadleft(ActionEvent event){
       myController.setScreen(ScreensFramework.BadleftScreenID);
    }
       
     @FXML
    private void goToBadright(ActionEvent event){
       myController.setScreen(ScreensFramework.BadrightScreenID);
    }
}
