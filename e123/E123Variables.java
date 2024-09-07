package org.example.e123;

public class E123Variables {
    // Declare instance variables to hold integer, String, double, boolean, and float values
    int num;
    String name;
    double price;
    boolean marr;
    float no;

    public static void main(String[] args) {
        // Create an instance of the class
        E123Variables user = new E123Variables();

        // Access instance variables and print them without assigning any values
        System.out.println(user.num);
        System.out.println(user.name);
        System.out.println(user.price);
        System.out.println(user.marr);
        System.out.println(user.no);

        // Print the default values of the instance variables

    }
}