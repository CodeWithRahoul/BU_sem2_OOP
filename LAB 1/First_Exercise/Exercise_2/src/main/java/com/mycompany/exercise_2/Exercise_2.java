
package com.mycompany.exercise_2;

import java.util.Scanner;
public class Exercise_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
System.out.print("Enter Your name: "); 
String name = s.nextLine(); 
System.out.print("Enter Your Enrollment: "); 
String enrol = s.nextLine();           
System.out.print("Enter Your Instructor name: "); 
String teacher = s.nextLine(); 
System.out.print("Enter Your semester: "); 
String sem = s.nextLine(); 
System.out.println("Name: " + name); 
System.out.println("Enrollment: " + enrol); 
System.out.println("Instructor Name: " + teacher); 
System.out.println("Semester : " + sem ); 
    }
}
