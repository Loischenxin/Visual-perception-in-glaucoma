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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
  
import com.jhlabs.image.EmbossFilter;  

public class BadrightController implements Initializable, ControlledScreen {

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
    private void goToTurnToLeft(ActionEvent event){
       myController.setScreen(ScreensFramework.TurnToLeftID);
    }
    
    @FXML
    public void handleKeyPressed(KeyEvent key)
    {
        if (key.getCode() == KeyCode.LEFT )
        {
            //label.setText("RIGHT PRESSED");
            myController.setScreen(ScreensFramework.TurnToLeftID);
        }
    System.out.println("Key Pressed: " + key.getCode());
    }
    
}
