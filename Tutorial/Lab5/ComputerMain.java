/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
//madam skema
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
        
        Monitor mymonitor = new Monitor();       
        Desktop mydesktop = new Desktop(mymonitor);
        Laptop mylaptop = new Laptop("Thinkpad", "Lenovo", 13.3);
                
        Scanner input= new Scanner(System.in);
        
        System.out.println("\nTHE DESKTOP OUTPUT INFORMATION FOR 1st ORDER");
        System.out.println("Desktop Brand: " + mydesktop.getBrand() + 
                " | " + "Desktop Form Factor: " + mydesktop.getFormFactor() + 
                " | " + "Desktop Storage Size: " + mydesktop.getStorageSize() + 
                "\n | " + "Desktop Screen Size: " + mydesktop.getMonitor().getScreenSize()+ 
                " | " + "Desktop Quantity: " + mydesktop.getQuantity() + 
                " | " + "Total Price for Desktop: " + mydesktop.calculatePrice());
        
        System.out.println("THE DESKTOP INPUT FOR SECOND ORDER");
        System.out.print("Please Enter the quantity amount to order: ");
        mydesktop.quantity = input.nextInt();
        System.out.println("\nTHE DESKTOP OUTPUT INFORMATION FOR 2nd ORDER");
                System.out.println("Laptop Brand: " + mydesktop.getBrand() + 
                " | " + "Desktop Form Factor: " + mydesktop.getFormFactor() + 
                " | " + "Desktop Storage Size: " + mydesktop.getStorageSize() + 
                "\n | " + "Desktop Screen Size: " + mydesktop.getMonitor().getScreenSize()+ 
                " | " + "Desktop Quantity: " + mydesktop.getQuantity() + 
                " | " + "Total Price for Desktop: " + mydesktop.calculatePrice());

        System.out.println("==============================================="); 
        
        System.out.println("\nTHE LAPTOP OUTPUT INFORMATION FOR 1st ORDER");
        System.out.println("");
        System.out.println("Laptop Brand: " + mylaptop.getBrand() + 
                " | " + "Laptop Type: " + mylaptop.getType()+ 
                " | " + "Laptop Memory Size: " + mylaptop.getMemorySize()+ 
                "\n | " + "Laptop Screen Size: " + mylaptop.getMonitor().getScreenSize()+ 
                " | " + "Laptop Quantity: " + mylaptop.getQuantity() + 
                " | " + "Total Price for Laptop: " + mylaptop.calculatePrice());
        
        System.out.println("THE LAPTOP INPUT FOR SECOND ORDER");
        System.out.print("Please Enter the quantity amount to order: ");
        mylaptop.quantity = input.nextInt();
        System.out.println("\nTHE LAPTOP OUTPUT INFORMATION FOR 2nd ORDER");
                System.out.println("Laptop Brand: " + mylaptop.getBrand() + 
                " | " + "Laptop Type: " + mylaptop.getType()+ 
                " | " + "Laptop Memory Size: " + mylaptop.getMemorySize()+ 
                "\n | " + "Laptop Screen Size: " + mylaptop.getMonitor().getScreenSize()+ 
                " | " + "Laptop Quantity: " + mylaptop.getQuantity() + 
                " | " + "Total Price for Laptop: " + mylaptop.calculatePrice());
                
    }
    
}
