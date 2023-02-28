package edu.smavs.basic03;

public class ForLoopBreak {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if(i<=4)
                continue;  // use break as well
            System.out.println(i);
        }
    }
}

