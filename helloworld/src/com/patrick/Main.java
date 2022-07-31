package com.patrick;
import java.awt.*;
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
        System.out.println(point2);
    }
}