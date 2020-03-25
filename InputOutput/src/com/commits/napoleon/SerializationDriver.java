package com.commits.napoleon;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPiece cp = new ChessPiece('P', "Black", new int[1][1]);

		try {
			
			FileOutputStream fos = new FileOutputStream("ChessPiece.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cp);
			oos.close();
			fos.close();
			
			System.out.println("done");
			
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
