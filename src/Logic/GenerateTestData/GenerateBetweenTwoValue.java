/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic.GenerateTestData;

/**
 *
 * @author my301
 */
public class GenerateBetweenTwoValue {
    
    public GenerateBetweenTwoValue()
    {
        
    }
    
    public String generateValue(String pramOne, String pramTwo)
    {
        String className = pramOne;
        String userValue = pramTwo;
        int size=0;
        String temp="";
        String parts [];
        int valueOne;
        int valueTwo;
        switch (className) {
            
            case "Custom Int":
                temp = ""+GenerateCommonMethods.intGen(Integer.parseInt(""+pramTwo.charAt(0)),Integer.parseInt(""+pramTwo.charAt(2)));
                break;
                
            case "Custom String":
                parts = userValue.split("-");                
                valueOne = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[2]));
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(valueOne,valueTwo));
                break;                
                
            case "String":
                size =  Integer.parseInt(""+userValue.charAt(0));
                parts = userValue.split("-");                
                valueOne = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[2]));
                for (int i = 0; i < size ; i++) 
                {
                    temp = temp+GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(valueOne, valueTwo));
                }
                break;
                
            case "Int":
                size =  Integer.parseInt(""+userValue.charAt(0));
                parts = userValue.split("-");
                
                for (int i = 0; i < size ; i++) 
                {
                    temp = temp+GenerateCommonMethods.intGen(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
                }
                break;
                
            case "Char":
                parts = userValue.split("-");                
                valueOne = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[1]));
                valueTwo = Integer.parseInt(""+GenerateCommonMethods.charToInt(parts[2]));
                temp = GenerateCommonMethods.intTochar(GenerateCommonMethods.intGen(valueOne,valueTwo));
                break;
                
            case "Date":
                temp = userValue;
                break;
                
            default :

                break;
                
        }// end Switch
        
        return temp;
    }
}
