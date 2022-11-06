/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computermain;

/**
 *
 * @author acer
 */

import java.util.Scanner;
public class ComputerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input= new Scanner(System.in);
  
        Computer mycomp1,mycomp2;

        System.out.println("LAB TASK ON POLYMORPHISM - Parent Reference to child object\n");

                System.out.println("CREATING RECORD FOR LAPTOP");
                System.out.print("Please enter new laptop type: ");
                String type = input.next();
                System.out.print("Please enter new laptop brand: ");
                String brand = input.next();
                System.out.print("Please enter new laptop screensize: ");
                double screensize = input.nextDouble();
                mycomp1 = new Laptop(type,brand,screensize);    
  
                System.out.println("CREATING RECORD FOR DESKTOP");
                mycomp2 = new Desktop();
                System.out.print("Please enter new Desktop Form Factor: ");
                ((Desktop)mycomp2).setFormFactor(input.next());
                System.out.print("Please enter new Desktop Storage Size: ");
                ((Desktop)mycomp2).setStorageSize(input.nextInt()); 

            System.out.println("");
            
            if(mycomp1 instanceof Laptop){
                Laptop mylap = (Laptop)mycomp1;
                System.out.println("DISPLAYING RECORD FOR LAPTOP");
                System.out.println("Type for Laptop: " + ((Laptop)mycomp1).getType() + " || "
                + "Brand for Laptop: " +  mycomp1.getBrand());
                System.out.println("Screen Size for Laptop: " +  ((Laptop)mycomp1).getScreenSize() + " || "
                + "Memory Size for Laptop: " +  ((Laptop)mycomp1).getMemorySize()); 
            }

           if(mycomp2 instanceof Desktop){
                System.out.println("DISPLAYING RECORD FOR DESKTOP");
                System.out.println("Brand for Desktop: " +  mycomp2.getBrand()
                 + " || " + "Form Factor for Desktop: " +  ((Desktop)mycomp2).getFormFactor()
                + " || " + "Storage Size for Desktop: " +  ((Desktop)mycomp2).getStorageSize());
            }
    }
    
}
