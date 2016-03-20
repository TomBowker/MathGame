package com.mycompany;

import java.util.List;
import java.util.Scanner;
import java.lang.String;

/**
 * Created by 90tombowker on 3/9/16.
 */

public class MathGame {

    // Users gameUser = new Users();

    // create the game
    public void playMathGame() throws Exception {

        ReadFilesClass rfc = new ReadFilesClass();

        List<String> questions = rfc.getQuestionsStrings();
        List<String> answers = rfc.getAnswersString();

        Scanner input = new Scanner(System.in);

        for (String element : questions) {

            //create question list
            int count = 1;

            System.out.println(count + ". " + element + "=");

            // for each question have the user answer up to five tries
            int counter = 0;

            // as the loop iterates through the questions the count is updated for the answers
            // this was intentional to avoid n^2 loop situation which can bog down the software
            int answerCount = 0;

            do {

                // if user input is not equal to the answers
                if(input.nextLine() == answers.get(answerCount)) {
                    System.out.println("Good Job!");
                    counter = 5;

                } else if(counter == 4) {
                    // if counter is equal to 5
                    System.out.println("I'm Sorry. You have run out of moves");
                } else {
                    System.out.println("Sorry, that was the wrong answer.");
                    System.out.println("Please try again: ");
                }

                counter++;

            } while (counter != 5);

            System.out.println(count + ". " + questions + " = " + answers);

            count++;
            answerCount++;

        }//

    }// end playMathGame

}
