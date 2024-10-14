
package com.mycompany.temperature;

import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
        System.out.println("Enter temperature in celsius");
        int a=sc.nextInt();
        float c =(a*9/5) + 32 ;
        System.out.println("Temperature in ferhanite is : "+c);
    }


}
}
