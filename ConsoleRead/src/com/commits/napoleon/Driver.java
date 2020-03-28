package com.commits.napoleon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BufferedReader class
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String userInput;
		
		System.out.print("Enter a string: ");
		
		try {
			userInput = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			userInput = "Invalid!!"; // needed to use the `userInput` variable after try/catch
			e.printStackTrace();
			main(args);
		}
		
		System.out.println(userInput);
		
//		
//		Scanner class
//		
		
		System.out.print("Enter another string: ");
		Scanner scan = new Scanner(System.in);
		
		String value = scan.nextLine();
		System.out.println(value);
		
//		scan.nextInt();
//		scan.nextFloat();
	}

}
