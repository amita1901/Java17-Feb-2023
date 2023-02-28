package edu.smavs.basic03;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArraySumDemo {

    public static void main(String[] args) {

        int[] data = {20,40,50,60,70,80};

        int sum= Arrays.stream(data).sum();

        OptionalDouble avg = Arrays.stream(data).average();

        long total = Arrays.stream(data).summaryStatistics().getCount();


        System.out.println("Total is : "+sum);
        System.out.println("Average is : "+avg);
        System.out.println("SummaryStatistics : "+total);

    }
}
