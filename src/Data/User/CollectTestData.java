/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import Data.WSDL.StoreWsdlData;
import Data.WSDL.StoreEnum;
import UserInterface.*;
import aDeleteME.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author my301
 */
public class CollectTestData {
    
    
    private StoreWsdlData swdObj;
    private int numOfCase;
    private int prameterLength;
    private int count;
    public CollectTestData(StoreWsdlData swdObj, String numOfCase)
    {
        this.swdObj = swdObj;
        this.numOfCase = Integer.parseInt(numOfCase);
        this.prameterLength =  swdObj.getElmentType().size();
        this.count=0;
    }
        
    public void TestCase(CollectTestData tdgObj)
    {
        if(count < prameterLength)
        {
            Object obj = swdObj.getElmentType().get(count);
            
            if(obj instanceof StoreEnum)
            {
                StoreEnum x =   (StoreEnum)obj;
                EnumGUI enumGenGuiFrame = new EnumGUI(x, tdgObj);
                enumGenGuiFrame.setSize(550,500);
                enumGenGuiFrame.setLocationRelativeTo(null);
                enumGenGuiFrame.setDefaultCloseOperation(EnumGUI.DISPOSE_ON_CLOSE);
                enumGenGuiFrame.setVisible(true);
                enumGenGuiFrame.revalidate();
                
            }
            else if(obj instanceof String)
            {
                String tempElementType = (String)swdObj.getElmentType().get(count);
                if(tempElementType.equals("int")|| tempElementType.equals("float")||tempElementType.equals("decimal")){
                    // call intGenGUI
                    IntegerGUI intGenGUIFrame = new IntegerGUI(tdgObj);
                    intGenGUIFrame.setSize(500,600);
                    intGenGUIFrame.setLocationRelativeTo(null);
                    intGenGUIFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
                    intGenGUIFrame.setVisible(true);
                    intGenGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("string")){
                    StringGUI stringGUIFrame = new StringGUI(tdgObj);
                    stringGUIFrame.setSize(500,600);
                    stringGUIFrame.setLocationRelativeTo(null);
                    stringGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    stringGUIFrame.setVisible(true);
                    stringGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("boolean")){
                    BooleanGUI booleanGUIFrame = new BooleanGUI(tdgObj);
                    booleanGUIFrame.setSize(500,400);
                    booleanGUIFrame.setLocationRelativeTo(null);
                    booleanGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    booleanGUIFrame.setVisible(true);
                    booleanGUIFrame.revalidate();
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(null, "Unknow dataType... Class: TestDataGen!");
                    TestFrame testFrame = new TestFrame(tdgObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }                
            }
            /* This count++ is very important because i check it against parameter length to keep it in the limit */
            count++;
        }
    }// end method
    
    
    public StoreWsdlData getStoreWsdlData()
    {
        return swdObj;
    }
    
    public int getCount()
    {
        return count;
    }   
}
