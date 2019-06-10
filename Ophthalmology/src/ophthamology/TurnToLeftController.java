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
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
/**
 * FXML Controller class
 *
 * @author mac
 */
public class TurnToLeftController implements Initializable , ControlledScreen {

    ScreensController myController;
    @FXML private ImageView filter;
    @FXML private Slider conChange; 
    @FXML private Label ContrastValue;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      
       conChange.setMin(-10.0f);
        conChange.setMax(10.0f);
        conChange.setValue(8.0f);
        conChange.setShowTickMarks(true);
        conChange.setShowTickLabels(true);
        conChange.setMajorTickUnit(1.0f);
        conChange.setBlockIncrement(0.25f);
        
        ContrastValue.setText(Double.toString(conChange.getValue()));
       
        
       conChange.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    System.out.println(new_val.doubleValue());
                    ContrastValue.setText(String.format("%.2f", new_val));
            }
        });
       

       
        
        try {  
           
            BufferedImage currentImage = ImageIO.read(new File ("/Users/mac/Desktop/Ophthalmology/src/ophthamology/c.png"));
            BufferedImage timg = new BufferedImage(currentImage.getWidth(), currentImage.getHeight(), BufferedImage.TYPE_INT_ARGB);  
            update(currentImage,timg);
           
              
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        
        
        
    }
    public void update(BufferedImage x, BufferedImage y)
    {
        conChange.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov,
                Number old_val, Number new_val) {
                    System.out.println(new_val.floatValue());
                   BufferedImage r=new Contrast(new_val.floatValue()).filter(x, y);
                   Image image = SwingFXUtils.toFXImage(r, null);
                   filter.setImage(image);
            }
        });
       
    }
    
    public void setScreenParent(ScreensController screenParent){
        myController = screenParent;
    }
    
    @FXML
    private void goToBadright(ActionEvent event){
       myController.setScreen(ScreensFramework.BadrightScreenID);
    }
    
    @FXML
    public void handleKeyPressed(KeyEvent key)
    {
        if (key.getCode() == KeyCode.RIGHT)
        {
            //label.setText("RIGHT PRESSED");
            myController.setScreen(ScreensFramework.BadrightScreenID);
        }
    System.out.println("Key Pressed: " + key.getCode());
    }
}
