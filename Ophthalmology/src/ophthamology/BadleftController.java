/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ophthamology;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

  
  
import java.awt.BorderLayout;  
import java.awt.image.BufferedImage;  
import java.net.URL;  
  
import javax.imageio.ImageIO;  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
  
import com.jhlabs.image.EmbossFilter;  


/**
 * FXML Controller class
 *
 * @author mac
 */
public class BadleftController implements Initializable , ControlledScreen {

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
    private void goToTestScreen(ActionEvent event){
       myController.setScreen(ScreensFramework.TestScreenID);
    }
  @FXML
    private void goToTurnToRight(ActionEvent event){
       myController.setScreen(ScreensFramework.TurnToRightID);
    }
}
