package com.example.java;

import java.util.Scanner;

public class Complex_Calculator {

    public static void main(String[] args) {
        String d1 = getInput("Enter first number:");
        String d2 = getInput("Enter second number:");
        String iws = getInput("Choose an operation: (+, -, /, *)");
        double res=0;
        try {
            switch (iws) {
                case "+":
                    res = add(d1, d2);
                    break;
                case "-":
                    res = sub(d1, d2);
                    break;
                case "/":
                    res = div(d1, d2);
                    break;
                case "*":
                    res = mul(d1, d2);
                    break;
                default:
                    System.out.println(" !!!Entered operation cannot be performed!!! ");

            }
            System.out.println("Answer is : "+res);
        }
        catch(Exception e){
            System.out.println("!!!!Entered format is incorrect!!!!\n"+e.getMessage());
        }

    }
    private static double add(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return  d1+d2;

    }

    private static double sub(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return  d1-d2;

    }
    private static double mul(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return  d1*d2;

    }
    private static double div(String a, String b) {
        double d1 = Double.parseDouble(a);
        double d2 = Double.parseDouble(b);
        return  d1/d2;

    }
    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();

    }
}



