/**
 * Package:com.vickllny.flowable
 * Classname: CallExternalSystemDelegate.java
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 8, 2018
 * Time: 3:20:45 PM
 * @author li.lin
 * @version 1.0
 */ 

package com.vickllny.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * Copyright: 川大智胜系统集成公司 
 * Date: Nov 8, 2018
 * Time: 3:20:45 PM
 * @author li.lin
 * @version 1.0
 */

public class CallExternalSystemDelegate implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("Calling the external system for employee "
	            + execution.getVariable("employee"));
	}

}
