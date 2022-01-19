package br.com.credit.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class External implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {

//        String var = (String) execution.getVariable("nome");
//      
//        execution.setVariable("nome", "Hello" + " " + var); 
//        System.out.println(execution.getVariable("nome"));
		System.out.println("EXTERNAL");
		
		
		

	}
	
	

}
