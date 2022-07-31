package com.patrick;
import java.awt.*;
import java.util.Arrays;
import  java.util.Date;
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
        System.out.println(y);
    }
}