package com.codedifferently.labs.partC;

public class AlgoChallenge {


    public static Boolean containE(String str) {
        int eCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) =='e') {
                eCount++;
            }
        }
        return eCount >= 1 && eCount<= 3;
    }


    public static String everyOther(String str, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i += n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(containE("Hello"));
        System.out.println(containE("Heelle"));
        System.out.println(containE("Heelele"));

        System.out.println(everyOther("Miracle", 2));
        System.out.println(everyOther("abcdefg", 2));
        System.out.println(everyOther("abcdefg", 3));
    }
}

