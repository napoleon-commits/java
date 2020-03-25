package com.commits.napoleon;

//Interfaces are implicitly abstract (you can add it, but it doesn't change anything)
public interface BlackPiecesInterface {
	
	// implicitly public static final (again, you can add it...but why when it is implicit?)
	char[][] pieceLocations = {
			{'R','N','B','K','Q','B','N','R'},
			{'P','P','P','P','P','P','P','P',},
			{},{},{},{},{},{}
	}; 
	
	void movePiece();
	
	default void defend() {
		System.out.println("D-fence!");
	}

}
