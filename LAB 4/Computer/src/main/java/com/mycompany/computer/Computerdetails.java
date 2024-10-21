
package com.mycompany.computer;
import java.util.Scanner;

public class Computerdetails {
    private String name;
    private String type;
    private String processor;
    private int ram;
    private int hardisk;
    private String motherboard;
    private String opticaldrive;
    
    
    void getInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Computer Details: ");
        System.out.print("Name : ");
        this.name = s.next();
        System.out.print("Type: ");
        this.type = s.next();
        System.out.print("Processor: ");
        this.processor = s.next();
        System.out.print("Ram (In GB): ");
        this.ram = s.nextInt();
        System.out.print("Hard Disk (In in GB): ");
        this.hardisk= s.nextInt();
        System.out.print("Motherboard: ");
        this.motherboard= s.next();
        System.out.print("Optical Drive: ");
        this.opticaldrive = s.next();
        
    }
    
    void display(){
        Scanner s = new Scanner(System.in);
        System.out.println("Computer Details: ");
        System.out.println("Name : " + this.name);
        System.out.println("Type: "+ this.type);
        System.out.println("Processor: " + this.processor);
        System.out.println("Ram (In GB): "+ this.ram);
        System.out.println("Hard Disk (In in GB): "+ this.hardisk);
        System.out.println("Motherboard: " + this.motherboard);
        System.out.println("Optical Drive: " + this.opticaldrive);
        
    }
    
    void update(){
        System.out.println("\nSelect the field you want to update: ");
        System.out.print("1. Name: \n2. Type \n3. Processor \n4. Ram \n5. Hard Disk \n6. Motherboard\n7. Optical Drive\n");
        Scanner s = new Scanner(System.in);
        int select = s.nextInt();
        switch (select) {
            case 1:
                System.out.print("Enter the new value: ");
                this.name = s.next();
                break;
            case 2:
                System.out.print("Enter the new value: ");
                this.type = s.next();
                break;
            case 3:
                System.out.print("Enter the new value: ");
                this.processor = s.next();
                break;
            case 4:
                System.out.print("Enter the new value: ");
                this.ram = s.nextInt();
                break;
            case 5:
                System.out.print("Enter the new value: ");
                this.hardisk = s.nextInt();
                break;
            case 6:
                System.out.print("Enter the new value: ");
                this.motherboard = s.next();
                break;
            case 7:
                System.out.print("Enter the new value: ");
                this.opticaldrive = s.next();
                break;
            default:
                throw new AssertionError();
        }
        
        display();
    }
    
}