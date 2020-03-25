package com.commits.napoleon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		BufferedReader br2 = null;
		
		String filePath = "/Users/byronhall/Documents/eclipse-workspace/InputOutput/src/com/commits/napoleon/data/io_read";
		
//		reading from a file: using readLine()
		
		try {
			
			br = new BufferedReader(new FileReader(filePath));
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
//		reading from a file: using read()
		
		try {
			
			br2 = new BufferedReader(new FileReader(filePath));
			
			int val = 0;
			char c;
			
//			-1 means end of file
			
			while((val = br2.read()) != -1) {
				c = (char) val;
				if(c == '\n') System.out.println();
				System.out.print(c);
			}
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
