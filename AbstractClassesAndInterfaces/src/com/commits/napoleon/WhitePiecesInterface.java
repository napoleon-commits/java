package com.commits.napoleon;

//Interfaces are implicitly abstract (you can add it, but it doesn't change anything)
public interface WhitePiecesInterface {
	
	// implicitly public static final (again, you can add it...but why when it is implicit?)
	char [][] pieceLocations = {
			{},{},{},{},{},{},
			{'P','P','P','P','P','P','P','P'},
			{'R','N','B','Q','K','B','N','R'}
	};
	
	void movePiece();
	
	default void attack() {
		System.out.println("Offense!");
	}
}
