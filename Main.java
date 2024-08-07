package com.tutorial;

//import java.awt.*;
//import java.util.Date;

//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        TYPICAL HELLO WORLD
//        System.out.println("Hello");

//        TYPES
//        int age = 30;
//

//        DATE
//        System.out.println(age);
//        Date now = new Date();
//
//        System.out.println(now);

//
//        byte x = 1;
//        byte y = 1;
//
//        x = 2;
//


//        POINTER
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//
//        System.out.println(point2);

//        CONCATENATION
//        String message =  "Hello";
//        String message2 = " world";
//        System.out.println(message + message2);


//        ARRAY
//          int[] numbers = new int[4];
//          numbers[0] = 1;
//
//
//        System.out.println(Arrays.toString(numbers));


//        CONSTANTS
//        final float PI = 3.14F;

//        IMPLICIT CASTING
//          double x = 1.1;
////          double y = x + 2;
//          int y = (int)x + 2;

//        METHOD CHAINING
//        String result = NumberFormat.getPercentInstance().format(.1);

//        System.out.println(result);


//        GET USER INPUT
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);


//       PROJECT MORTGAGE CALCULATOR
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal Amount: ");
//        double principalAmount = scanner.nextDouble();
//
//        System.out.print("Annual Interest Rate: ");
//        double annualInterestRate = scanner.nextDouble();
//
//        System.out.print("Period (Years): ");
//        int periodInYears = scanner.nextInt();
//
//        double periodInMonths = periodInYears * 12;
//
//        double monthlyInterestRate = (annualInterestRate / 100) / 12;
//
//        double mortgage = principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonths))
//                / (Math.pow(1 + monthlyInterestRate, periodInMonths) - 1);
//        System.out.print("mortgage :  " + Math.round((double)mortgage));



//        FizzBuzz  Exercise
//        System.out.print("Number");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        if (number%3!=0 || number%5!=0)
//        {
//
//
//
//            if (number%3==0)
//            {
//                System.out.print("Buzz");
//            }
//            else if (number%5==0)
//            {
//                System.out.print("Fizz");
//            }
//            else
//            {
//                System.out.print("FizzBuzz");
//
//            }
//        }
//        else
//        {
//            System.out.print(number);
//
//        }

//        FOR EACH
//        String[] names = {"Joe", "Ana", "Bob"};
//
//
//        for (String name : names)
//        {
//            System.out.println(name);
//        }
//
//    IF DIVISIBLE BY 5 FIZZ
//            DIV BY 3 BUZZ
//            IF DIVISBLE BY BOTH 3 AND 5
//            FIZZBUZZ
//NOT DIV BY 5 AND 3
//            PRINT THE NUMBER






//      PROJECT MORTGAGE CALCULATOR
//        Scanner scanner = new Scanner(System.in);
//        double principalAmount;
//        double annualInterestRate;
//        int periodInYears;
//
//
//        do
//        {
//            System.out.print("Principal Amount (Between $1K and $1M): ");
//            principalAmount = scanner.nextDouble();
//            if (principalAmount < 1000 || principalAmount > 1000000)
//            {
//                System.out.print("Enter a value between $1000 and $1000000 only");
//            }
//        }
//        while (principalAmount < 1000 || principalAmount > 1000000);
//
//        do
//        {
//            System.out.print("Annual Interest Rate: ");
//            annualInterestRate = scanner.nextDouble();
//            if (annualInterestRate < 0 || annualInterestRate > 30)
//            {
//                System.out.print("Enter an interest between 0 and 30 only");
//            }
//        }
//        while(annualInterestRate < 0 || annualInterestRate > 30);
//
//        do
//        {
//            System.out.print("Period (Years): ");
//            periodInYears = scanner.nextInt();
//        }
//        while(periodInYears < 1 || periodInYears > 30);
//
//        double periodInMonths = periodInYears * 12;
//
//        double monthlyInterestRate = (annualInterestRate / 100) / 12;
//
//        double mortgage = principalAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, periodInMonths))
//                / (Math.pow(1 + monthlyInterestRate, periodInMonths) - 1);
//        System.out.print("mortgage :  " + Math.round(mortgage));


        //Methods
        greetUser("Darrel", "Israel");
        greetUser("John", "Cena");
        greetUser("Bob", "Cat");

    }
    public static void greetUser(String firstName, String lastName)
    {
        System.out.println("Hello " + firstName + " " + lastName);
    }


}