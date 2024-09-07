package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int interger;
    double Double;
    char achar;

    public static void main(String[] args) {
        E121Variables user = new E121Variables();
        // Create 2 instances of the class
        E121Variables user2=new E121Variables();
        // Assign values to variables for the first instance
        user.interger = 10;
        user.Double = 10.23;
        user.achar = 'a';
        // Print values of the first instance
        System.out.println(user.interger);
        System.out.println(user.Double);
        System.out.println(user.achar);
        // Assign values to variables for the second instance
        user2.interger=100;
        user2.Double=100.23;
        user2.achar='s';

        // Print values of the second instance
        System.out.println(user2.interger);
        System.out.println(user2.Double);
        System.out.println(user2.achar);
    }
}