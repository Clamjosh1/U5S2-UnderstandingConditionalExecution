package com.codedifferently.labs.partA.ex02;

public class TernaryOperator {
    public static String modify() {
        String response = "";

        int x = 4, y = 9;

        // Use the ternary operator to duplicate the logic
        x = (y / x < 3) ? (x + y) : (x * y);

        response += ("After ternary operator, x = " + x);

        return response;
    }

    public static void main(String[] args) {
        String modifyOutput = modify();
        System.out.print(modifyOutput);
    }
}
