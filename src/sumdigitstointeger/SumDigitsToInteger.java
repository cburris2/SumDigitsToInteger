/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdigitstointeger;

/**
 *
 * @author Charlie Burris
 */
import java.util.Scanner;

public class SumDigitsToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Take in an integer and add up its digits to get a sum.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000.");
        int num1 = input.nextInt();
        int num2 = num1 % 10; // num2 is last digit
        
        int num3 = num1 / 10; // num3 is remaining digits
        int num4 = num3 % 10;
        int num5 = num3 / 10;
        int num6 = num5 % 10;
        int num7 = num5 / 10;
        int num8 = num7 % 10;
        int num9 = num7 / 10;
        int numTotal = num2+num4+num6+num8;
        System.out.println("Answer "+"\f"+ num1 + "\f"+num2 +"\f"+ num3 +"\f"+ num4+ "\f"+ num5+ 
        "\f"+ num6+"\f"+ num7 +"\f"+ num8 +"\f"+ num9);
        System.out.println("Digits 1-4 in reverse order \f"+num2+num4+ num6+ num8);
        System.out.println("Answer "+numTotal);
    }
    
}
