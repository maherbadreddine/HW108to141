package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {

        int[] X = {7, 9, 6, 1, 0, 5, 3, 2};
          int sumEvenTAX = 0;
             for (int i : X)
                 sumEvenTAX = sumEvenTAX + i;

        for (int i = 0; i < X.length; i++)
            if(X[i]%2==0)

              System.out.println(sumEvenTAX);




}}
