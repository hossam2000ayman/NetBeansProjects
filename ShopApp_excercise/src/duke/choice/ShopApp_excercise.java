/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.WebServer;
import io.helidon.webserver.ServerConfiguration;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hp
 */
public class ShopApp_excercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the Duke Choice Shop !");
        Clothing item1 = new Clothing();
        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        Clothing item2 = new Clothing();
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(45.9);
        item2.setSize("S");

     

        
        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("L");

        for (Clothing item : items) {
            System.out.println("Item is : " + item.getDescription() + "\n" + " with price : " + item.getPrice() + "\n" + " with size : " + item.getSize());
        }
       
    
        try{
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
 /*catch*/  ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
        
        
        
    
        
        
        
        
        
        
        
    }
  
}


