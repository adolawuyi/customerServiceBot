package com.datadriven;

import org.w3c.dom.ls.LSOutput;
import com.sun.source.tree.WhileLoopTree;

import java.util.Locale;
import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        System.out.print("Hello! My name is David.\n\n" +
                "Your Online Assistance.\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name);

        String question;
                question = "Who is the current UCL Holder?";
        String choiceOne = "Place an Order";
        String choiceTwo = "Return and Refund";
        String choiceThree = "Complain";
        String choiceFour = "Other Enquiry";

        System.out.println(choiceOne + "\n\n" + choiceTwo + "\n\n" + choiceThree + "\n\n" + choiceFour +"\n\n");

        Scanner response = new Scanner(System.in);
        String input = scanner.next();
    }



}
