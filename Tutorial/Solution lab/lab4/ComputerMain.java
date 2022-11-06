/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;



public class ComputerMain {

    public static void main(String[] args) {
        Monitor mymonitor = new Monitor();       
        Desktop mydesktop = new Desktop(mymonitor);
        Laptop mylaptop = new Laptop("Thinkpad", "Lenovo", 13.3);
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("THE INPUT MONITOR INFORMATION FOR DESKTOP");
        System.out.print("Please Enter Monitor Brightness: ");
        mydesktop.getMonitor().setBrightness(input.nextInt());
        System.out.print("Please Enter Monitor Screen Size: ");
        mydesktop.getMonitor().setScreenSize(input.nextDouble());        
        
        System.out.println("\nTHE INPUT MONITOR INFORMATION FOR LAPTOP");
        System.out.print("Please Enter Monitor Brightness: ");
        mylaptop.getMonitor().setBrightness(input.nextInt());
        System.out.print("Please Enter Monitor Screen Size: ");
        mylaptop.getMonitor().setScreenSize(input.nextDouble());     
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR DESKTOP");
        System.out.println("The following are the information for DESKTOP");
        System.out.println("Desktop Brand: " + mydesktop.getBrand() + 
                " | " + "Desktop Form Factor: " + mydesktop.getFormFactor() + 
                " | " + "Desktop Storage Size: " + mydesktop.getStorageSize() + 
                "\n | " + "Desktop Screen Size: " + mydesktop.getMonitor().getScreenSize()+ 
                " | " + "Desktop Brightness: " + mydesktop.getMonitor().getBrightness());
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR LAPTOP");
        System.out.println("The following are the information for LAPTOP");
        System.out.println("Laptop Brand: " + mylaptop.getBrand() + 
                " | " + "Laptop Type: " + mylaptop.getType()+ 
                " | " + "Laptop Memory Size: " + mylaptop.getMemorySize()+ 
                "\n | " + "Laptop Screen Size: " + mylaptop.getMonitor().getScreenSize()+ 
                " | " + "Laptop Brightness: " + mylaptop.getMonitor().getBrightness());      
        
        mydesktop = null;
        mylaptop = null;
        System.out.println("");
        System.out.println("\nMonitor Screen Size: " + mymonitor.getScreenSize());
        
    }
    
}
