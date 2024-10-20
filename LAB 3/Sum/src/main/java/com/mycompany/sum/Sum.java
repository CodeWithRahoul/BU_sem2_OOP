
package com.mycompany.sum;
import java.util.Scanner;

public class Sum {
public static int ComputeOddSum(int input) {
    if (input <= 1) {
        return 0;
    }
    if (input % 2 == 1) {
        return (input - 2) + ComputeOddSum(input - 2); // Adjusted here
    } else {
        return (input - 1) + ComputeOddSum(input - 2); // If input is even, include the last odd number
    }
}

    
    public static int ComputeEvenSum(int input) {
        if (input <= 2) {
            return 0;
        }
        if (input % 2 == 0) {
            return (input - 2) + ComputeEvenSum(input - 2);
        } else {
            return (input - 1) + ComputeEvenSum(input - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        
        while (true) {
            System.out.print("Enter a positive number (negative to quit): ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Exiting program.");
                break;
    }

            System.out.println("Sum of odd numbers less than " + number + ": " + ComputeOddSum(number));
            System.out.println("Sum of even numbers less than " + number + ": " + ComputeEvenSum(number));
}
    }
}
