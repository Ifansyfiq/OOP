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
public class Computer {
    
     protected String brand;
     protected double price;
     protected int quantity;
    
    public Computer(){
        brand="DELL";
        price=2000;
        quantity=3;
    }
    
    public Computer(String brand){
        this.brand=brand;
        price=2000;
        quantity=3;
    }
     
    public double calculatePrice(){
        double totalPrice=0;
        totalPrice=price*quantity;
        return totalPrice;
    }
    
    protected String getbrand(){
        return brand;
    }
    
    protected void setbrand(String brand){
        this.brand=brand;
    }
    
    protected double getprice(){
        return price;
    }
    
    protected void setprice(double price){
        this.price=price;
    }
    
    protected int getquantitiy(){
        return quantity;
    }
    
    protected void setquantity(int quantity){
        this.quantity=quantity;
    }
    
}
