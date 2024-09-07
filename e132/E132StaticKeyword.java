package org.example.e132;

public class E132StaticKeyword {

    static int reduce10(int[][] numbers) {
        for (int[] num : numbers) {
            for (int n : num) {
                n = n - 10;
                System.out.print(n + " ");
            }
            System.out.println();
        }
        int n = 0;
        return n;
    }

    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        E132StaticKeyword.reduce10(numbers);

    }
}
