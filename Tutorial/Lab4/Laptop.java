/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
//skema madam
 */
package computermain;

/**
 *
 * @author acer
 */
public class Laptop extends Computer{
    
     private String type;
    //private String brand;
    private double screenSize;
    private int memorySize;
    private Monitor monitor;
    
    public Laptop(String type, String brand, double screenSize ){
        super();
        this.type = type;
        this.brand = brand;
        this.screenSize = screenSize;
        memorySize = 8;
        monitor = new Monitor();
        
    }
    
    public double calculatePrice(){
        double totalPrice=0,add;
        if (quantity<=10){
            add=2460;
        }
        else if(quantity>10&&quantity<=50){
            add=2260;
        }
        else {
            add=2160;
        }
        
        totalPrice=(price*quantity)+add;
        return totalPrice;
    }  
    
    public void upgradeMemory(){
        setMemorySize(getMemorySize() + 8);
    }
    public void downgradeMemory(){
        setMemorySize(getMemorySize() - 4);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
