/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;



public class ComputerMain {

    public static void main(String[] args) {
              
        Scanner input= new Scanner(System.in);
        
        Computer mycomputer [] = new Computer[2];
        System.out.println("LAB TASK ON POLYMORPHISM WITH ABSTRACTION & INTERFACE\n");
        for (int i = 0; i < mycomputer.length; i++) {
            
            if( i < 1){
                System.out.println("CREATING RECORD FOR LAPTOP");
                System.out.print("Please enter new laptop type: ");
                String type = input.next();
                System.out.print("Please enter new laptop brand: ");
                String brand = input.next();
                System.out.print("Please enter new laptop screensize: ");
                double screensize = input.nextDouble();
                mycomputer[i] = new Laptop(type,brand,screensize);    
            }else{
                System.out.println("CREATING RECORD FOR DESKTOP");
                mycomputer[i] = new Desktop();
                System.out.print("Please enter new Desktop Form Factor: ");
                ((Desktop)mycomputer[i]).setFormFactor(input.next());
                System.out.print("Please enter new Desktop Storage Size: ");
                ((Desktop)mycomputer[i]).setStorageSize(input.nextInt()); 
               }
         }
        
        
            System.out.println("");
        for (int i = 0; i < mycomputer.length; i++) {
            
            if(mycomputer[i] instanceof Laptop){
                Laptop mylap = (Laptop)mycomputer[i];
                System.out.println("DISPLAYING RECORD FOR LAPTOP");
                System.out.println("Type for Laptop" + (i+1) + ": " + ((Laptop)mycomputer[i]).getType() + " || "
                + "Brand for Laptop" + (i+1) + ": " +  mycomputer[i].getBrand());
                System.out.println("Screen Size for Laptop" + (i+1) + ": " +  ((Laptop)mycomputer[i]).getScreenSize() + " || "
                + "Memory Size for Laptop" + (i+1) + ": " +  ((Laptop)mycomputer[i]).getMemorySize());
                System.out.println("Digital machine bit: "  + DigitalMachine.BIT); 
                ((Laptop)mycomputer[i]).processOutput();
                System.out.println("INPUT from : " + ElectronicDevice.INPUT);
                System.out.println("OUTPUT to : " + ElectronicDevice.OUTPUT);
                ((Laptop)mycomputer[i]).showOutput();
            }else{
                System.out.println("DISPLAYING RECORD FOR DESKTOP");
                System.out.println("Brand for Desktop" + (i+1) + ": " +  mycomputer[i].getBrand()
                 + " || " + "Form Factor for Desktop" + (i+1) + ": " +  ((Desktop)mycomputer[i]).getFormFactor()
                + " || " + "Storage Size for Desktop" + (i+1) + ": " +  ((Desktop)mycomputer[i]).getStorageSize());
                System.out.println("Digital machine bit: "  + DigitalMachine.BIT); 
                ((Desktop)mycomputer[i]).processOutput();
                System.out.println("INPUT from : " + ElectronicDevice.INPUT);
                System.out.println("OUTPUT to : " + ElectronicDevice.OUTPUT);
                ((Desktop)mycomputer[i]).showOutput();
            }
            
        }
    
    }
    
}
