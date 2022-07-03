/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_statement;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Switch_statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("enter the correct password");
        Scanner hossam = new Scanner(System.in);
        String password = hossam.next();
        
        switch (password){
            case "hossam":
                System.out.println("password is correct");
                break;
            default:
                System.out.println("incorrect password ");
        }
    }
    
}
