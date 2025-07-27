package com.wipro.day_six;

public class FactorialDivision {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
            int num = 5;
            int fact = factorial(num);

      
        try {
            int result = fact / 0;
            System.out.println("Result: " + result);
        	} 
         catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
         }
    }
}

