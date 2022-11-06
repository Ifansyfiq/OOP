/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUAWEI
 */
public class Stress implements patient{
    @Override
    public void diagnosis()
    {
      System.out.println("Diagnosis :Stress");
    }
    @Override
    public String definition(){
        return "Feeling of being overwhelmed or unable to cope with mental or emotional pressure.";
    }
    @Override
    public void suggestion(){
      System.out.println("\n1)Take time to relax ");
      System.out.println("\n2) Practice self-care");
    }
}
