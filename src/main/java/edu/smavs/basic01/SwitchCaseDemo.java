package edu.smavs.basic01;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        int value;
        System.out.println("Enter the Value : ");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();

        switch (value)
        {
            case 0:
                System.out.println("Option 0 Selected");
                break;
            case 1:
                System.out.println("Option 1 Selected");
                break;
            case 2:
                System.out.println("Option 2 Selected");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
