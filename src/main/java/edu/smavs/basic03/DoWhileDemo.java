package edu.smavs.basic03;
// WAP to print 1 to 10 using doWhile Loop

public class DoWhileDemo {
    public static void main(String[] args) {

        int i=1;

        do {
            System.out.println(i);
            i++;

        }while(i<=10);
        System.out.println();
        System.out.println("--------");
        DoWhileDemo dd = new DoWhileDemo();
        dd.reverseLoop();

    }

    public void reverseLoop()
    {
        int j=10;
        do {
            System.out.println(j);
            j--;
        }while(j>=1);

    }
}
