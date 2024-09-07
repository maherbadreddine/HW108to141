package org.example.e131;

public class E131StaticKeyword {
    public String thirdLetter (String s){
        for (int i = 0; i < s.length(); i+=3) {
            System.out.print(s.charAt(i));
        }
        return s;
    }

    public static void main(String[] args) {

        E131StaticKeyword user=new E131StaticKeyword();
        user.thirdLetter("hello there");
        System.out.println();
        user.thirdLetter("technology");
        System.out.println();
    }
}