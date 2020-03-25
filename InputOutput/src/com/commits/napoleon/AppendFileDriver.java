package com.commits.napoleon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath = "/Users/byronhall/Documents/eclipse-workspace/InputOutput/src/com/commits/napoleon/data/io_write";
		
		try {
			String content = "\nThis will be added to the end of an existing file";
			
			File f = new File(filePath);
			
			if(!f.exists()) {
				f.createNewFile();
			}
			
			FileWriter fw = new FileWriter(f, true); // true = append, false = overwrite
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(content);
			bw.close();
			
			System.out.println("Successfully appeneded to file.");
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
