package com.commits.napoleon;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPiece cp = null;
		
		try {
			
			FileInputStream fis = new FileInputStream("ChessPiece.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			cp = (ChessPiece) ois.readObject();
			
			fis.close();
			ois.close();
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
			return;
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		
		System.out.println(cp.toString());
	}

}
