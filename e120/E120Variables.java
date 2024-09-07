package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
    String schoolName;
    int year;
    int batchNumber;

    public static void main(String[] args) {

        E120Variables user= new E120Variables();
        // Access variables from the main method and assign specific values to them
        user.schoolName= "Syntax";
        user.year=2020;
        user.batchNumber=6;
        // Print values of your variables in the specified format
        System.out.println("I am a student of batch "+user.batchNumber+" studying at "+user.schoolName+" in the year of "+user.year);
    }
}