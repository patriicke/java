package com.patrick;
import java.awt.*;
import java.text.NumberFormat;
import  java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Bytes
        byte age = 20;
        //Long integers
        long viewCount = 3_123_456_789L;
        //Floats
        float price = 10.1F;
        //Characters
        char letter = 'A';
        //Strings
        String userName = "Patrick";
        String message = "Hello Patrick hope that tomorrow you will come to work";
        //Booleans
        boolean isTrue = true;
        //Reference data types in java
        Date now = new Date();
        //Differentiating primitive types and reference types
        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x =10;
        //Strings
        //String hello = new String("Hello World"); This actually works but there is shorthand for doing this
        String hello = "Hello World!" + "!!"; //This is valid in java
        String replaced = hello.replace("World", "Patrick");
        //Arrays in java
        int[] numbers = {1,2,3,4,5};
        //int[] numbers = new int[5] This is another way of dealing with arrays;
        //System.out.println(Arrays.toString(numbers));
        //Multi-dimensional arrays in java
        //int[][] numbersMulti = new int[10][3];This is multi dimensional arrays
        int[][] numbersMulti = {{1,2,3}};
        //System.out.println(Arrays.deepToString(numbersMulti));
        //Java constants
        final  float PI = 3.14F;
        //System.out.println(PI);
        //Java arithmetic operators
        float div = (float) 10 / (float) 3;
        //System.out.println(div);
        //Java increment operators
        int y = 3;
        y++;
        //System.out.println(y);
        //Type casting and type conversion
        //Implicit type casting
        double num1 = 4.5;
        int sum = (int) num1 + 5;
        //System.out.println(sum);
        //Explicit type casting
        String num3 = "1.1";
        int sum3 = (int) Double.parseDouble(num3) + 4;
        //System.out.println(sum3);
        //Java Math class
        int ceilNumber = (int) Math.ceil(1.2);
        int floorNumber = (int) Math.floor(1.2);
        int roundNumber = (int) Math.round(1.2);
        //System.out.println(roundNumber);
        //Generating random number between 0 and 100
        int randomNumber =  (int) (Math.random() * 100);
        //System.out.println(randomNumber);
        //Formatting numbers
        String currency = NumberFormat.getCurrencyInstance().format(1234576.67);
        String percentage = NumberFormat.getPercentInstance().format(0.85);
        //System.out.println(currency);
        //System.out.println(percentage);
        //Reading data from user
        /*Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter your age: ");
        //int yourAge = scanner.nextInt();
        System.out.print("Enter your name: ");
        String yourName = scanner.nextLine();
        //System.out.println("Your name is " + yourName + " and you are "  + " years old.");
*/
        //Flow control
        int t = 1;
        int g = 1;
        //System.out.print(t == g);

        //FizzBuzz
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int enteredNumber = scanner.nextInt();
        if(enteredNumber%3==0 && enteredNumber%5==0)
            System.out.println("FizzBuzz");
        else if(enteredNumber%5 ==0 )
            System.out.println("Fizz");
        else if (enteredNumber%3 ==0)
            System.out.println("Buzz");
        else System.out.println(enteredNumber);
        */

        //Iterations
        //for and while loop like in other programming languages

        //Type exit to get out of the loop
        String exit = "";
        while (!exit.equals("exit")){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter text: ");
            exit = scanner.nextLine().trim();
        }
    }
}