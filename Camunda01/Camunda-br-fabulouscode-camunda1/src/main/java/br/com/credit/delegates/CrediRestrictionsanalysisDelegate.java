package br.com.credit.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("CrediRestrictionsanalysisDelegate")
public class CrediRestrictionsanalysisDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        //String var = (String) execution.getVariable("hasRestriction");
//      
//        execution.setVariable("nome", "Hello" + " " + var); 
        System.out.println("Restriction: " + execution.getVariable("hasRestriction"));
    	
    	//execution.setVariable("hasRestriction", true);
    	 
        
       
    }
}
