/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Year_Project_Logic_V1;

import Final_Year_Project_Data_V1.*;
import Final_Year_Project_GUI_V1.*;
import aFinal_Year_Project_DeleteME_V1.TestFrame;
import java.util.*;

/**
 *
 * @author my301
 */
public class TestDataGen {
    
    
    private StoreWsdlData swdObj;
    private int numOfCase;
    private int prameterLength;
    private int count;
    public TestDataGen(StoreWsdlData swdObj, String numOfCase)
    {
        this.swdObj = swdObj;
        this.numOfCase = Integer.parseInt(numOfCase);
        this.prameterLength =  swdObj.getElmentType().size();
        this.count=0;
    }
    
    public void TestCase(TestDataGen tdgObj)
    {
        if(count < prameterLength)
        {
            Object obj = swdObj.getElmentType().get(count);
            
            if(obj instanceof StoreEnum)
            {
                StoreEnum x =   (StoreEnum)obj;
                EnumGenGui enumGenGuiFrame = new EnumGenGui(x, tdgObj);
                enumGenGuiFrame.setSize(550,500);
                enumGenGuiFrame.setLocationRelativeTo(null);
                enumGenGuiFrame.setDefaultCloseOperation(EnumGenGui.DISPOSE_ON_CLOSE);
                enumGenGuiFrame.setVisible(true);
                enumGenGuiFrame.revalidate();
                
            }
            else if(obj instanceof String)
            {
                System.out.println(""+swdObj.getElmentType());
                String tempElementType = (String)swdObj.getElmentType().get(count);
                if(tempElementType.equals("int")|| tempElementType.equals("float")||tempElementType.equals("decimal")){
                    // call intGenGUI
                    IntGenGUI intGenGUIFrame = new IntGenGUI(tdgObj);
                    intGenGUIFrame.setSize(450,600);
                    intGenGUIFrame.setLocationRelativeTo(null);
                    intGenGUIFrame.setDefaultCloseOperation(IntGenGUI.DISPOSE_ON_CLOSE);
                    intGenGUIFrame.setVisible(true);
                    intGenGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("string")){
                    TestFrame testFrame = new TestFrame(tdgObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }
                
                else if(tempElementType.equals("boolean")){
                    TestFrame testFrame = new TestFrame(tdgObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }
                
                else{
                    TestFrame testFrame = new TestFrame(tdgObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }                
            }
            count++;
        }
    }// end method
    
    
    public void intGen(String rangeFrom, String rangeTo)
    {
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 100; ++idx){
            int randomInt = randomGenerator.nextInt((Integer.parseInt(rangeFrom) - Integer.parseInt(rangeTo) + 1) + Integer.parseInt(rangeTo));
            
            System.out.println("Generated : " + randomInt);
        }
    }
    
}
