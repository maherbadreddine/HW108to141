package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;

    // Create a method to display values of instance variables
    void print(){
        System.out.println("The capital of "+countryName+" is "+capital+" and "+populationSize);
        // System.out.println(capital);
        // System.out.println(populationSize);
    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        E122Variables user=new E122Variables();
        E122Variables user1=new E122Variables();

        // Assign values to variables for the first instance
        user.countryName = "USA ";
        user.capital = "Washington DC ";
        user.populationSize = 330000000;
        // Execute the method to display values for the first instance
        user.print();
        // Assign values to variables for the second instance
        user1.countryName ="Kazakhstan";
        user1.capital = "Astana";
        user1.populationSize = 18500000;
        // Execute the method to display values for the second instance
        user1.print();
    }
}