
package com.mycompany.sum;
import java.util.Scanner;

public class Sum {

    public static int ComputeOddSum(int input){
   if  (input <= 0) { 
            return 0;  
        }
        else if (input % 2 == 1) { 
            return input + ComputeOddSum(input - 2);  // Recursive case for odd numbers 
        }
        else { 
            return ComputeOddSum(input - 1);  // Adjust if the number is even 

} 
}
   public static int ComputeEvenSum(int input){
     int sum = 0; 
for (int i = 2; i < input; i += 2) { 
sum += i; 
} 
return sum; 
}
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
int number; 
while (true) { 
System.out.println("Enter a number (enter a negative number to exit): "); 
number = input.nextInt(); 
if (number <0){
break;  // Exit if negative number is entered 
} 
int oddSum = ComputeOddSum(number - 1);  // Compute sum of odd numbers 
int evenSum = ComputeEvenSum(number);    // Compute sum of even numbers 
 
System.out.println("Sum of odd numbers less than " + number + " is: " + oddSum); 
System.out.println("Sum of even numbers less than " + number + " is: " + evenSum); 
System.out.println("Program exited."); 
    }
}
}