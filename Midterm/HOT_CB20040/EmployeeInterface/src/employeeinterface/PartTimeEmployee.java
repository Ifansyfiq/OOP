/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeinterface;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class PartTimeEmployee extends Employee{
    
    private int numberHourWork;
    final double RATE_PER_HOUR = 3.5;
    private Scanner scan;
   
    public PartTimeEmployee(String empNo, String name,int numberHourWork){
        super(empNo,name,numberHourWork);
        this.numberHourWork=numberHourWork;
    }
    
    @Override 
    public double computeTotalPayment(){
        
         double computeTotalPayment = getTotalPayment()*RATE_PER_HOUR;
         
         return computeTotalPayment;
    }
    
}
