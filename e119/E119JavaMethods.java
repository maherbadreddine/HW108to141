package org.example.e119;

public class E119JavaMethods {
    public static void main(String[] args) {
        // Students will write the code here.
        E119JavaMethods e = new E119JavaMethods();
        e.censor("anticipation");
    }

    String censor(String censorLetter) {
        String word = censorLetter.replace("a", "*");
        System.out.println(word);
        return word;
    }
}