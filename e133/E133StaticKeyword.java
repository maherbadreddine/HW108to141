package org.example.e133;

import org.example.e132.E132StaticKeyword;

public class E133StaticKeyword {

    public static int countA(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {

            if( s.charAt(i)=='a' || s.charAt(i)=='A') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        E133StaticKeyword.countA("aaa");
        E133StaticKeyword.countA("aaBBdf8k3AAadnklA");


    }
}