package com.commits.napoleon;

import java.lang.reflect.Field;


public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Strings are immutable, no?";
		
		Class<String> stringClass = String.class;
		
		try {
			
			Field value = stringClass.getDeclaredField("value");
			
//			System.out.println(value);
			
			value.setAccessible(true);
			
			value.set(s, "New String :D".toCharArray());
			
			System.out.println(s);
			
		} catch(NoSuchFieldException nsfe) {
			nsfe.printStackTrace();
		} catch(SecurityException se) {
			se.printStackTrace();
		} catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		} catch(IllegalAccessException iae2) {
			iae2.printStackTrace();
		}

	}

}
