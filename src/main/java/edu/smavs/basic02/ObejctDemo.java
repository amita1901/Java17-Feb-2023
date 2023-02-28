package edu.smavs.basic02;


import edu.smavs.basic01.ObjectDemo;

public class ObejctDemo {

    public static void main(String[] args) {


        ObejctDemo od = new ObejctDemo();
        ObjectDemo od2 = new ObjectDemo();

        od.getName();
        System.out.println(od.calc());

        System.out.println("===========");

        od2.getName();
      //  System.out.println(od2.calc());

    }

    // Method name is getName()
    public void getName()
    {
        System.out.println("Amit");
    }
    public long calc()
    {
        return 100*2;
    }

}
