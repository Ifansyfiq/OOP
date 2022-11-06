/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUAWEI
 */
public class Depression implements patient{
    
    @Override
    public void diagnosis()
    {
      System.out.println("Diagnosis :Depression");
    }
    @Override
    public String definition(){
        return "Mood disorder that causes a persistent  feeling of sadness and loss of interest.";
    }
    @Override
    public void suggestion(){
      System.out.println("\n1)Get help early ");
      System.out.println("\n2) Get some exercise");
    }
}

