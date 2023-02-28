package edu.smavs.basic02;

// WAP to find out big no between 2 integer using if else enter value by user

import java.util.Scanner;

public class DemoIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First No : ");
        int a  = sc.nextInt();

        System.out.println("Enter the Second no : ");
        int b = sc.nextInt();

        if(a<b) {
            System.out.println("A is small : " + a);
            System.out.println("Amit");
        }
        else {
            System.out.println("B is small : " + b);
            System.out.println("Jigar");
        }
    }
}
