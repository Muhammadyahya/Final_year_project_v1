/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.User;

import GrahpicalUserInterface.BooleanGUI;
import GrahpicalUserInterface.StringGUI;
import GrahpicalUserInterface.IntegerGUI;
import GrahpicalUserInterface.EnumGUI;
import Data.WSDL.StoreWsdlData;
import Data.WSDL.StoreEnum;
import aDeleteME.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author my301
 */
public class CollectTestData {
    
    private ArrayList<ArrayList<String>> testCaseInfo;
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
        this.testCaseInfo=new ArrayList<ArrayList<String>>();
    }
    
    public void addTestCaseInfo(ArrayList<String> pram)
    {
        this.testCaseInfo.add(pram);
    }
    
    public void TestCase(CollectTestData collectTestDataObj)
    {
        System.out.println("cccccccccccccccccccccc"+ count);
        System.out.println("ttttttttttttttttttttttttttttttttt");
        if(count < prameterLength)
        {
            
            System.out.println("ppppppppppppppppppppppppppppppppppppp");
            Object obj = swdObj.getElmentType().get(count);
            
            if(obj instanceof StoreEnum)
            {
                StoreEnum x =   (StoreEnum)obj;
                EnumGUI enumGenGuiFrame = new EnumGUI(x, collectTestDataObj);
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
                    IntegerGUI intGenGUIFrame = new IntegerGUI(collectTestDataObj);
                    intGenGUIFrame.setSize(500,600);
                    intGenGUIFrame.setLocationRelativeTo(null);
                    intGenGUIFrame.setDefaultCloseOperation(IntegerGUI.DISPOSE_ON_CLOSE);
                    intGenGUIFrame.setVisible(true);
                    intGenGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("string")){
                    StringGUI stringGUIFrame = new StringGUI(collectTestDataObj);
                    stringGUIFrame.setSize(500,600);
                    stringGUIFrame.setLocationRelativeTo(null);
                    stringGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    stringGUIFrame.setVisible(true);
                    stringGUIFrame.revalidate();
                }
                
                else if(tempElementType.equals("boolean")){
                    BooleanGUI booleanGUIFrame = new BooleanGUI(collectTestDataObj);
                    booleanGUIFrame.setSize(500,400);
                    booleanGUIFrame.setLocationRelativeTo(null);
                    booleanGUIFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    booleanGUIFrame.setVisible(true);
                    booleanGUIFrame.revalidate();
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(null, "Unknow dataType... Class: TestDataGen!");
                    TestFrame testFrame = new TestFrame(collectTestDataObj);
                    testFrame.setSize(550,500);
                    testFrame.setLocationRelativeTo(null);
                    testFrame.setDefaultCloseOperation(TestFrame.DISPOSE_ON_CLOSE);
                    testFrame.setVisible(true);
                    testFrame.revalidate();
                }
            }
        }
        else{
            /* delete this at very end */
            for (int i = 0; i < testCaseInfo.size(); i++) {
                
                for (int j = 0; j < testCaseInfo.get(i).size(); j++) {
                    System.out.println(" User Data      "+testCaseInfo.get(i).get(j));
                }
                
            }
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
    
    public void increaseCount()
    {
        count++;
    }
}
