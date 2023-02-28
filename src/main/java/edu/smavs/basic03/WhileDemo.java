package edu.smavs.basic03;

public class WhileDemo {

    public static void main(String[] args) {

        int i=1;

        while(i<=10)
        {
            System.out.println(i);
            i++;
        }
        WhileDemo wd = new WhileDemo();
        wd.ReverseWhile();
    }


    public void ReverseWhile()
    {
        int j =10;
        while(j>=1)
        {
            System.out.println(j);
            j--;
        }
    }
}
