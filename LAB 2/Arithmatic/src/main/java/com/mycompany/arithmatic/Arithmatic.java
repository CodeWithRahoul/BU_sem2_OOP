
package com.mycompany.arithmatic;
import java.util.Scanner;

public class Arithmatic {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
System.out.println("Enter Integer 1");
int a=sc.nextInt();
System.out.println("Enter Integer 2");
int b=sc.nextInt();
int c =a + b;
int d =a - b;
int e =a * b;
System.out.println("Sum = "+c);
System.out.println("Difference = "+d);
System.out.println("Product = "+e);

}
}
