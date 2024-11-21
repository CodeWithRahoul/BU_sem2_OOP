

package com.mycompany.numberscalculation;
import java.util.Scanner;

public class NumbersCalculation {
 public static int calculatePrimeCalories(int input) {
        int sumPrimes = 0;
        for (int num = 2; num < input; num++) {
            if (isPrime(num)) {
                sumPrimes += num;
            }
        }
        return sumPrimes;
    }
  public static int calculateOddCalories(int input) {
        int sumOdds = 0;
        for (int num = 1; num < input; num += 2) {
            sumOdds += num;
        }
        return sumOdds;
    }

    public static int calculateEvenCalories(int input) {
        int sumEvens = 0;
        for (int num = 0; num < input; num += 2) {
            sumEvens += num;
        }
        return sumEvens;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
          return true;
    }
   public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter your workout duration (negative number to exit): ");
            int userInput = s.nextInt();

            if (userInput < 0) {
                System.out.println("Exiting the app.");
                break;
            }

            int primeCalories = calculatePrimeCalories(userInput);
            int oddCalories = calculateOddCalories(userInput);
            int evenCalories = calculateEvenCalories(userInput);

            System.out.println("Calories burned for prime numbers: " + primeCalories);
            System.out.println("Calories burned for odd numbers: " + oddCalories);
            System.out.println("Calories burned for even numbers: " + evenCalories);
        }

        
    }

   

   
      
}
