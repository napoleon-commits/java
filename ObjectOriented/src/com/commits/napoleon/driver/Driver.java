package com.commits.napoleon.driver;

import com.commits.napoleon.models.Beta;
import com.commits.napoleon.models.Magnus;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Magnus m = new Magnus();
		
//		captures the variable in the extended subclass, Beta
		
		System.out.println(m.getMyPublicInt());
		
		Beta b = new Magnus();
		
		System.out.println(b.getMyPublicInt());
		

	}

}
