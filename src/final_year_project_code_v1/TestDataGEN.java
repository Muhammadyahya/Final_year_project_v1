/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_code_v1;

import java.util.*;

/**
 *
 * @author my301
 */
public class TestDataGEN {
    
    public TestDataGEN()
    {
        
    }
    
    public void intGen(String rangeFrom, String rangeTo)
    {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 100; ++idx){
        int randomInt = randomGenerator.nextInt((Integer.parseInt(rangeFrom) - Integer.parseInt(rangeTo) + 1) + Integer.parseInt(rangeTo));
       
        System.out.println("Generated : " + randomInt);
    }
        
       System.out.println("some thing is happening!!!!!");
        
    }
    
}
