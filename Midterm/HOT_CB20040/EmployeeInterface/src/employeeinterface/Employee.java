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
public class Employee {
    
    protected String empNo;
    protected String name;
    protected double totalPayment;
    
    
    public Employee(String empNo, String name,double salary, int numOfYearEmployeed){ 
        this.empNo=empNo;
        this.name=name;
    }
    
    public Employee(String empNo, String name, int numberHourWork){ 
        this.empNo=empNo;
        this.name=name;
    }
    
    public void setEmpNo(String empNo){
        this.empNo=empNo;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setTotalPayment(double totalPayment){
        this.totalPayment=totalPayment;
    }
    
    public String getEmpNo(){
        return empNo;
    }
    
    public String getName(){
        return name;
    }
     
    public double getTotalPayment(){
        return totalPayment;
    }
    
    
     public double computeTotalPayment(){
         double computeTotalPayment = getTotalPayment();
         return computeTotalPayment; 
    }
    
}
