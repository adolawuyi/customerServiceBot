package com.datadriven;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<MultiQuestion> questionsSet;
    public Game() {
        questionsSet = new ArrayList<MultiQuestion>();
        String q = "Where does the sun rise?";
        String[] a = {"East", "West", "South", "North"};
        questionsSet.add(new MultiQuestion(q, a, "East"));

        q = "Who invented the Telephone?";
        // must reuse variable with new String[]
        // array constant can only be used during initialization
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
        questionsSet.add(new MultiQuestion(q, a, "Alexander Bell"));
        Collections.shuffle(questionsSet, new Random());
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        int numCorrect = 0;
        // show question from questionSet
        for(int question = 0; question < questionsSet.size(); question++) {
            System.out.println(questionsSet.get(question).getQuestion());
            int numChoices = questionsSet.get(question).getChoices().size();
            for (int choices = 0; choices < numChoices; choices++) {
                System.out.println((choices + 1) + ": " +
                        questionsSet.get(question).getChoices().get(choices));
            }
            int playerAnswer = scan.nextInt();
            ArrayList<String> choiceSet =
                    questionsSet.get(question).getChoices();
            String correctAnswer = questionsSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex + 1){
                numCorrect++;
            }
            scan.close();
            System.out.printf("You got " + numCorrect + " correct answer(s)");

        }
    }
}
