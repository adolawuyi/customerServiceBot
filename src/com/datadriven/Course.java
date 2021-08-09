package com.datadriven;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Course {
    public static void main(String[] args) {
        System.out.print("Hello! My name is David.\n\n" +
                "I was created in 2021.\n\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Hello, " + name+"!");


    }



}
