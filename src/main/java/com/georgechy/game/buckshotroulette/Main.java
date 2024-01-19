package com.georgechy.game.buckshotroulette;

import javax.swing.JFrame;
import java.util.Scanner;

public class Main {

    int option = 0;

    


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("///////////////////////////////////////");
        System.out.println("**** *  * **** *  * **** *  * **** ****");
        System.out.println("*  * *  * *    * *  *    *  * *  *  *  ");
        System.out.println("***  *  * *    **   **** **** *  *  *  ");
        System.out.println("*  * *  * *    * *     * *  * *  *  *  ");
        System.out.println("**** **** **** *  * **** *  * ****  *  ");
        System.out.println("                                       ");
        System.out.println("***  **** *  * *    **** **** **** ****");
        System.out.println("*  * *  * *  * *    *     *    *   *   ");
        System.out.println("**   *  * *  * *    ****  *    *   ****");
        System.out.println("* *  *  * *  * *    *     *    *   *   ");
        System.out.println("*  * **** **** **** ****  *    *   ****");
        System.out.println("///////////////////////////////////////\n\n\n\n");

        System.out.println("Select an option: \n\n1. Play\n2. Exit\n3. Settings\n\n");


        System.out.print("Option: ");
        // Read an integer from the user
        int option = scanner.nextInt();

        scanner.close();

        // Use the user's input
        System.out.println("You selected option: " + option);

        switch (option) {
            case 1: //play
                

                break;

            case 2: //exit
                

                break;                
        
            case 3: //settings
                System.exit(0);

                break;
            
            default: //


                break;
        


        }
    }
}
