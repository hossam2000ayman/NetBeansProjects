/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbracket;

import java.util.Stack; //built in 

/**
 *
 * @author hp
 */
public class CheckBracket {

    public static boolean checkParentheses(String s) {
        char[] arr = s.toCharArray(); //convert String to array of characters
        //also we can do it 
        //s.charAt(0);

        Stack sas = new Stack();
        boolean correct = true; //by default any experession i s true unless
        ///it provide it's opposite(contrust)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                sas.push(arr[i]);
            } else if (arr[i] == ')') {
                if (sas.isEmpty()) {
                    //how to do pop and the stack was empty
                    correct = false;
                    break;
                } else {
                    sas.pop();
                }
            }else{
                continue;
            }
            if(!sas.isEmpty()){
                correct = false;
            }
           

        }
         if(correct) return true;
            else return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String exp = "(2+5(1+3))";
        System.out.println(checkParentheses(exp));
    }
}

