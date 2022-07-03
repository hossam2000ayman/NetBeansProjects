
package gui1;
import javax.swing.*;
public class SimpleWindow extends JFrame{
    
    public SimpleWindow (){
        //JFrame F = new JFrame();
        setTitle("Window1");
        setSize(300, 300); // initial size
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
