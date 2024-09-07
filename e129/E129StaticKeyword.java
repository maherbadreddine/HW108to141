package org.example.e129;

public class E129StaticKeyword {

    public static String countryName;
    public static   String continent;

    void print (){
        System.out.println(countryName+" located on "+continent);
    }

    public static void main(String[] args) {

        E129StaticKeyword user = new E129StaticKeyword();

        user.countryName="Morocco";
        user.continent="Africa continent";
        user.print();

    }
}