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
        brand = "DELL";
        price = 2000.0;
        quantity = 3;
    }
    
        public Computer(String brand){
        this.brand = brand;
        price = 2000.0;
        quantity = 3;
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double calculatePrice(){
        return price * quantity;
    }
}
