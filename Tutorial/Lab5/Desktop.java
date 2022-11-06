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
public class Desktop extends Computer{
     private String formFactor;
    //private String brand; remove this data member in LT6
    private int storageSize;
    private Monitor monitor;
    
    public Desktop(){
        formFactor = "microTower";
        storageSize = 512;
    }
    
    public Desktop(Monitor monitor){
        super("HP");
        formFactor = "microTower";
        storageSize = 512;
        this.monitor = monitor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getBrand() {
         return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
            
    public double calculatePrice(){
        if (quantity <= 10)
        return price * quantity + 1450;
        else if (quantity >  10 && quantity <= 50)
             return price * quantity + 1250;
        else
            return price * quantity + 1150;
    }
}
