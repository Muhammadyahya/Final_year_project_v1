/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package final_year_project_WsdlParsing_V1;

import java.util.ArrayList;

/**
 *
 * @author my301
 */
public class StoreEnum extends Object{
    
    private String resElementName;
    private ArrayList <String> enumValue;    
    
    public StoreEnum(String elementName)
    {
        this.resElementName = elementName;
        this.enumValue = new ArrayList<>();
    }
    
    public void addEnumValue(String value)
    {
        this.enumValue.add(value);
    }
    
    public ArrayList<String> getEnumValue()
    {
        return this.enumValue;
    }
    
    public String getResElementName()
    {
        return resElementName;
    }
    
    
}
