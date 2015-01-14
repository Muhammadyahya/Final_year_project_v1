/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Final_Year_Project_Logic_V1;

import groovy.xml.MarkupBuilder;
import java.io.StringWriter;
import java.util.HashMap;
import com.predic8.wsdl.*;
import com.predic8.wstool.creator.*;
/**
 *
 * @author Muhammad Yahya
 */
public class RunWsdlTest {
    
    public static void main(String[] args) {
        
        WSDLParser parser = new WSDLParser();
        
        Definitions wsdl = parser.parse("/homes/my301/year3/Project/other/sendsmsworld.wsdl");
        
        StringWriter writer = new StringWriter();
        
            HashMap<String, String> formParams = new HashMap<String, String>();
            formParams.put("xpath:/create/article/name", "foo");
            formParams.put("xpath:/create/article/description", "bar");
            formParams.put("xpath:/create/article/price/amount", "00.00");
            formParams.put("xpath:/create/article/price/currency", "USD");
            formParams.put("xpath:/create/article/id", "1");
        
        //SOAPRequestCreator constructor: SOARequestCreator(Definitions, Creator, MarkupBuilder)
        SOARequestCreator creator = new SOARequestCreator(wsdl, new RequestTemplateCreator(), new MarkupBuilder(writer));
        
        //creator.createRequest(PortType name, Operation name, Binding name);
        creator.createRequest("ArticleServicePT", "create", "ArticleServicePTBinding");
        
        System.out.println(writer);
    }
}


