/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post_fix_evaluation;

/**
 *
 * @author hp
 */
public class Post_fix_evaluation {

    public static boolean operator_checker(char o){
        return(o=='%' || o=='/' || o=='*'|| o=='+'|| o=='-');
        //return true if you found character is one of the operators %,/,*,-,+
    }
    public static void main(String[] args) {
   
        String question = "45*21-42";
        Stack s = new Stack(question.length());
        for (int i = 0;i<question.length();i++){
            char c = question.charAt(i); //pass on each char in the String and assign to them
        
            if(Character.isDigit(c)){ //if it's  number
                //stacks of integers
                int t = Integer.parseInt(String.valueOf(c));//get new variable and convert the String to integer
                s.push(t);
                
                if(operator_checker(c) == true){
                    int v1 = s.pop(); int v2 = s.pop();
                    if(c=='*'){
                        s.push(v2*v1);
                    }
                    if(c=='/'){
                    s.push(v2/v1);
                }
                    if(c=='-'){
                        s.push(v2-v1);
                    }
                    if(c=='+'){
                        s.push(v2+v1);
                    }
                }
            }
        }
                System.out.println(s.pop());
            
        }
    }

    

