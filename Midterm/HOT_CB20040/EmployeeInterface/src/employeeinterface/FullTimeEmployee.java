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
public class FullTimeEmployee extends Employee{
    
    private double salary;
    private int numOfYearEmployeed;
    final private double ALLOWANCE_RATE = 110;
    private Scanner scan;
    
    public FullTimeEmployee(String empNo, String name,double salary, int numOfYearEmployeed){
      super(empNo,name,salary,numOfYearEmployeed);
      this.salary=salary;
      this.numOfYearEmployeed=numOfYearEmployeed;
    }
    
   
    public double calculateAllowance(){
      
       double allowance = numOfYearEmployeed * ALLOWANCE_RATE;
        
        return allowance;
    }
 
    @Override 
    public double computeTotalPayment(){
         double computeTotalPayment = getTotalPayment() + calculateAllowance();
         return computeTotalPayment;
    }
    
    
    
}
