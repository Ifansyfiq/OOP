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
public class EmployeeInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        
         int EmpType;
         
         
        FullTimeEmployee ft = new FullTimeEmployee("FT1001","Amerul",3200,17);  
        PartTimeEmployee pt = new PartTimeEmployee("PT1003","Naim",210);
         
        System.out.println("\nplease select your mode (full-time[0], part-time[1]): ");
        EmpType = scan.nextInt();
        
        
        //choose type
        if (EmpType==0){
          
            System.out.println("\nYou is FULL TIME EMPLOYEE");
            System.out.println("Please Enter Your Salary: ");
            ft.setTotalPayment(scan.nextInt());
            System.out.println("Please Enter Your year of Employment: ");
            int YearEmpl = scan.nextInt();
            System.out.println("Please Enter Employee number: ");
            String EmpNuml = scan.next();
            System.out.println("Please Enter Employee name: ");
            String namEEmpl = scan.next();
            
            
            System.out.println("\nEmployee number: " + ft.getEmpNo());
            System.out.println("Employee name: " + ft.getName());
            System.out.println("Employee Total Payment: RM" + ft.computeTotalPayment());
           
        }
        else {
            
            System.out.println("\nYou is PART TIME EMPLOYEE");
            System.out.println("Please Enter number of hours worked: ");
            pt.setTotalPayment(scan.nextInt());
            System.out.println("Please Enter Employee number: ");
            String EmpNum2 = scan.next();
            System.out.println("Please Enter Employee name: ");
            String namEEmp2 = scan.next();
            
            System.out.println("\nEmployee number: " + pt.getEmpNo());
            System.out.println("Employee name: " + pt.getName());
            System.out.println("Employee Total Payment: RM" + pt.computeTotalPayment());
        }
           
        
    }
    
}
