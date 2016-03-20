package com.mycompany;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 90tombowker on 3/15/16.
 */
public class ReadFilesClass {
    protected List<String> getQuestionsStrings() throws FileNotFoundException {
        List<String> questions = new ArrayList<>();

        FileReader readQuestions =
                new FileReader("/home/90tombowker/sandbox/MathGame/src/test/resources/testQuestions.txt");

        Scanner inputFile = new Scanner(readQuestions);

        while (inputFile.hasNext()) {
            questions.add(inputFile.nextLine());
        }
        return questions;
    }

    protected List<String> getAnswersString() throws FileNotFoundException {
        List <String> answers = new ArrayList<>();

        FileReader readAnswers = new FileReader("/home/90tombowker/sandbox/MathGame/src/test/resources/testAnswers.txt");

        Scanner inputFile = new Scanner(readAnswers);

        while (inputFile.hasNext()) {
            answers.add(inputFile.nextLine());
        }
        return answers;
    }
}
