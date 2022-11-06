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
public class HoneyBee_Sales {
    private double BASIC_PRICE;
    private double HONEYCOMB;
    private double BLACK_PEARL;
    private int quantity;
    private int choice;
    
    HoneyBee_Sales (int quantity, int choice){          
        this.quantity=quantity;
        this.choice=choice;
    }
    
    public double getTotalPrice (){
        try(Scanner input= new Scanner(System.in)){
            BASIC_PRICE=8;
      
        if (choice==1){
        }
            else if (choice==2){
                    System.out.print("\nPlease enter add-on [HONEYCOMB(1) or add-BLACK_PEARL(2)]: ");
                    int add = input.nextInt();
                    if(add==1){
                    HONEYCOMB=7;
                    return quantity*(BASIC_PRICE+HONEYCOMB);
                    }
                    else 
                    {
                    BLACK_PEARL=2.50;
                    return quantity*(BASIC_PRICE+BLACK_PEARL);
                    }
                    }
        }
        return quantity*(BASIC_PRICE);
        }
        
    }
  
