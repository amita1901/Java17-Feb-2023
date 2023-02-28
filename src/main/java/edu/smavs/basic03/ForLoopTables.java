package edu.smavs.basic03;

// WAP to print 10 tables

import java.util.Scanner;

public class ForLoopTables {

    public static void main(String[] args) {

       // int num=7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.printf("%d * %d = %d \n",num,i,num*i);
    }
}
