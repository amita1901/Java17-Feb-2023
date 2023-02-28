package edu.smavs.basic03;

// WAP to calculate sum of 5 Element  using array and print output on terminal

import java.util.Arrays;


public class ArrayDemo {

    public static void main(String[] args) {

        int[] data = {23,44,55,66,77,88};  // Array always start with 0

        System.out.println(Arrays.toString(data));

        Arrays.stream(data).forEach(System.out::println);

    }
}
