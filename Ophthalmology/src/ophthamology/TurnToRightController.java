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


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.BorderLayout;  
import java.awt.image.BufferedImage;  
import java.net.URL;  
  
import javax.imageio.ImageIO;  

import com.jhlabs.image.ContrastFilter; 
import java.io.File;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.BorderLayout;  
import java.awt.image.BufferedImage;  
import java.net.URL;  
  
import com.jhlabs.image.EmbossFilter;  
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
/**
 * FXML Controller class
 *
 * @author mac
 */
public class TurnToRightController implements Initializable , ControlledScreen {

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
    private void goToBadleft(ActionEvent event){
       myController.setScreen(ScreensFramework.BadleftScreenID);
    }
    
}
