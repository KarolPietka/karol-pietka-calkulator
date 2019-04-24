package com.calculator;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }
}

class Application {

    public static void main(String [] args) {
        Calculator calculator = new Calculator();

        int addResult1 = calculator.add(5, 5);
        System.out.println("Add result = " + addResult1);

        if (addResult1 == 10) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }

        int addResult2 = calculator.add(20, 5);
        System.out.println("Add result = " + addResult2);

        if (addResult2 == 25) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }

        int multiplicationResult1 = calculator.multiplication(3, 3);
        System.out.println("Multiplication result = " + multiplicationResult1);

        if (multiplicationResult1 == 9) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }
        int multiplicationResult2 = calculator.multiplication(40, 5);
        System.out.println("Multiplication result = " + multiplicationResult2);

        if (multiplicationResult2 == 200) {
            System.out.println("RESULT OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
