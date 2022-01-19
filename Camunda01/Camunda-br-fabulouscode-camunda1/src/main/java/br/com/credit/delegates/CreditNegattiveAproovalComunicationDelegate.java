package br.com.credit.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("CreditNegattiveAproovalComunicationDelegate")
public class CreditNegattiveAproovalComunicationDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

//        String var = (String) execution.getVariable("nome");
//      
//        execution.setVariable("nome", "Hello" + " " + var); 
//        System.out.println(execution.getVariable("nome"));
        
       
    }
}
