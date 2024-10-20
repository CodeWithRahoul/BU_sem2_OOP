

package com.mycompany.numbersum;
import java.util.Scanner;

public class NumberSum {
      static int sum(int a, int b) {
        // Base case: if a equals b, return a (or b)
        if (a == b) {
            return a;
        }
        // Recursive case: add the current number and call the function for the next
        return a + sum(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first positive integer: ");
        int first = scanner.nextInt();
        System.out.println("Enter the second positive integer: ");
        int second = scanner.nextInt();

       
        if (first > second) {
            System.out.println("Please ensure the first number is less than or equal to the second number.");
        } else {
            int result = sum(first, second);
            System.out.println("The sum of all integers between " + first + " and " + second + " is: " + result);
        }
        
    }
}