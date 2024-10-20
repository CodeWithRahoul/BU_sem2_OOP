

package com.mycompany.patientinfo;
import java.util.Scanner;

public class PatientInfo {

    String pNumber, pName, pEmail, pContact, pComplain;
    int pAge;
    double pBill;

    // Method to take patient's data
    public void Take_Patient_data() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Number: ");
        pNumber = sc.nextLine();

        System.out.print("Enter Patient Name: ");
        pName = sc.nextLine();

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

    // Method to print the receipt
    public void Print_Receipt() {
        System.out.println("\n---- Patient Receipt ----");
        System.out.println("Patient Number: " + pNumber);
        System.out.println("Patient Name: " + pName);
        System.out.println("Patient Age: " + pAge);
        System.out.println("Patient Email: " + pEmail);
        System.out.println("Patient Contact: " + pContact);
        System.out.println("Patient Complain: " + pComplain);
        System.out.println("Total Bill: $" + pBill);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        PatientInfo hr = new  PatientInfo();
        hr.Take_Patient_data();
        hr.Print_Receipt();
    }
  
}

