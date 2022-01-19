package br.com.credit.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("DocumentsInputDelegate")
public class DocumentsInputDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        //String var = (String) execution.getVariable("hasRestriction");
//      
//        execution.setVariable("nome", "Hello" + " " + var); 
        System.out.println("In: DocumentsInputDelegate");
    	
    	//execution.setVariable("hasRestriction", true);
    	 
        
       
    }
}
