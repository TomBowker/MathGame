package com.mycompany;

import java.util.Scanner;
import java.io.FileReader;

/**
 * Created by 90tombowker on 3/10/16.
 */

public class MainMenu {



//    public void displayMenu() throws Exception {
//        FileReader menu = new FileReader("/home/90tombowker/sandbox/MathGame/src/test/resources/gameMenu.txt");
//
//        mainMenu();
//    }// end displayMenu

    // Menu for game
    public String mainMenu(int userInput) throws Exception {

        //displayMenu();
//        Scanner input = new Scanner(System.in);
//        userInput = input.nextInt();
        String response;

        switch (userInput) {
            // Start the game
            case 1:
                // hit play
                response = "You Hit Play";
                return response;

            // Exit the game
            case 2:
                // hit exit
                response = "You Hit Exit";
                return response;

            // Show the results
            case 3:
                //display the users results
                response = "You Hit Results";
                return response;

            default:
                response = "Invalid Input";
                return response;


        }// end switch
    }// end mainMenu
}
