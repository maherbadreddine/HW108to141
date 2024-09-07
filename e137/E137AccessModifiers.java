package org.example.e137;

public class E137AccessModifiers {
    String name;
    String city;
    String nameOfSchool;
    String batchNumber;

    void print(){
        System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {

        E137AccessModifiers user = new E137AccessModifiers();
        user.name="John";
        user.city="Miami";
        user.nameOfSchool="Syntax";
        user.batchNumber="9";
        user.print();

    }
}