/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUAWEI
 */
import java.util.Scanner;
public class HoneyBee_Transaction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input= new Scanner(System.in);
        HoneyBee_Sales buyer;
       
        
        System.out.print("\nPlease enter quantity to buy: ");
        int quantity = input.nextInt();
        System.out.print("\nPlease enter option [basic(1) or add-on(2)]: ");
        int choice = input.nextInt();
        buyer = new HoneyBee_Sales(quantity, choice);
        
        System.out.println("");
        
        System.out.println("\nYour total price is RM" + buyer.getTotalPrice());
    }
    
}
