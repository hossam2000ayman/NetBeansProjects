/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package way_to_long_string;
import java.util.Scanner;
/**
 *
 * @author hp
 */
//Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.
//
//Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.
//
//This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.
//
//Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".
//
//Bonus: Calculate how many times each letter appeared in the word
public class Way_To_Long_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hossam  = new Scanner(System.in);
        
       
       String word = hossam.next();
       int words = args.length;
       System.out.println("a = "+words);
        System.out.println(word.charAt(0)+""+(word.length()-2) +""+word.charAt(word.length()-1));
    }                                        //important to do in 
                                     // this ( ..............)
                                     //         ^  ^   ^    ^  ^
                                     //         |  |   |    |  |
    
}
