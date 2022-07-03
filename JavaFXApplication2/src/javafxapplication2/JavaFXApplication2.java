/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class JavaFXApplication2 extends Application implements EventHandler {
    
    Button button;
    Button button2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //write code here
        primaryStage.setTitle("title of window");
        
        button = new Button();
        button.setText("click me");
        button.setOnAction(this); // same to action listener
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2); // to add component in scene
        
        Scene scene = new Scene(layout,300,250);
        primaryStage.setScene(scene);
        primaryStage.show();  //setVisible
        
        button2 = new Button();
        button2.setText("button 2");
        button2.setOnAction(this);
        
        
    }

    @Override
    public void handle(Event event) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        if(event.getSource()==button){
            JOptionPane.showMessageDialog(null,"yes success");
        }
        
        if(event.getSource()==button2){
            JOptionPane.showMessageDialog(null,"yes success inn button 2");
        }
        
        
    }
    
}
