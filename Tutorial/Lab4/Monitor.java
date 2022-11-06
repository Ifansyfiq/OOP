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
public class Monitor {
    
     private int brightness;
    private double screenSize;
    
    public Monitor(){
        brightness = 250;
        screenSize = 17;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
