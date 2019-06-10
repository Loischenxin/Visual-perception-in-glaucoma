/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ophthamology;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.BorderLayout;  
import java.awt.image.BufferedImage;  
import java.net.URL;  
  
import javax.imageio.ImageIO;  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
  
import com.jhlabs.image.EmbossFilter; 

/**
 *
 * @author Angie
 */
public class ScreensFramework extends Application {
    
    public static String HomePageScreenId = "homePage";
    public static String HomePageScreenFile = "homePage.fxml";
    public static String GuidanceScreenID = "GuidanceScreen";
    public static String GuidanceScreenFile = "GuidanceScreen.fxml";
    public static String TestScreenID = "TestPage";
    public static String TestScreenFile ="TestPage.fxml";
    public static String BadleftScreenID ="BadleftScreen";
    public static String BadleftScreenFile ="Badleft.fxml";
    public static String BadrightScreenID ="Badright";
    public static String BadrightScreenFile ="Badright.fxml";   
    public static String TurnToRightID = "TurnToRight";
    public static String TurnToRightFile ="TurnToRight.fxml";
    public static String TurnToLeftID ="TurnToLeft";
    public static String TurnToLeftFile ="TurnToLeft.fxml";
    
    @Override
    public void start(Stage primaryStage) {
        
        ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(ScreensFramework.HomePageScreenId, ScreensFramework.HomePageScreenFile);
        mainContainer.loadScreen(ScreensFramework.GuidanceScreenID, ScreensFramework.GuidanceScreenFile);
        mainContainer.loadScreen(ScreensFramework.TestScreenID,ScreensFramework.TestScreenFile);
        mainContainer.loadScreen(ScreensFramework.BadleftScreenID,ScreensFramework.BadleftScreenFile);
        mainContainer.loadScreen(ScreensFramework.BadrightScreenID,ScreensFramework.BadrightScreenFile);
        mainContainer.loadScreen(ScreensFramework.TurnToRightID,ScreensFramework.TurnToRightFile);
        mainContainer.loadScreen(ScreensFramework.TurnToLeftID,ScreensFramework.TurnToLeftFile);
                
                
                mainContainer.setScreen(ScreensFramework.HomePageScreenId);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        launch(args);
       
    }
}