
package com.mycompany.patientinfo;
import java.util.Scanner;

public class Patientinfo {
    String pNumber, pName, pEmail, pContact, pComplain;
    int pAge;
    double pBill;

public void patient_Data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter patient`s name: ");
    pName = sc.nextLine();
    System.out.println("Enter patient`s number: ");
    pNumber = sc.nextLine();
    System.out.print("Enter Patient Age: ");
        pAge = sc.nextInt();
        sc.nextLine();
System.out.print("Enter Patient Email: ");
        pEmail = sc.nextLine();

        System.out.print("Enter Patient Contact: ");
        pContact = sc.nextLine();

        System.out.print("Enter Patient Complain: ");
        pComplain = sc.nextLine();

        System.out.print("Enter Patient Bill: ");
        pBill = sc.nextDouble();

        
}
    public void patient_Data_Print(){
        
        System.out.println("\n---- Patient Receipt ----");
                  
        System.out.println("Patient Name: " + pName);
        System.out.println("Patient Number: " + pNumber);
        System.out.println("Patient Age: " + pAge);
        System.out.println("Patient Email: " + pEmail);
        System.out.println("Patient Contact: " + pContact);
        System.out.println("Patient Complain: " + pComplain);
        System.out.println("Total Bill: $" + pBill);
        System.out.println("-------------------------");

        
    }
    public static void main(String[] args) {
       Patientinfo hr = new Patientinfo();
       hr.patient_Data();
       hr.patient_Data_Print();
    }
}
