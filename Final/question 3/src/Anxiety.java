/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUAWEI
 */
public class Anxiety implements patient{
    
    @Override
    public void diagnosis()
    {
      System.out.println("Diagnosis :Anxiety");
    }
    @Override
    public String definition(){
        return "Frequently have intense and persistent worry and fear about everyday situations.";
    }
    @Override
    public void suggestion(){
      System.out.println("\n1)Reach out to family and friends ");
      System.out.println("\n2) Get some exercise");
    }
    
}
