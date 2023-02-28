package edu.smavs.basic01;



public class EnumDemo {

    enum Product {
        MAC,
        LENOVO,
        HP,
        IBM,
    }

    public static void main(String[] args) {

        Product p = Product.IBM;
        System.out.println(p);
    }

}
