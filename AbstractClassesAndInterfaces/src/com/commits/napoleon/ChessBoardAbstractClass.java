package com.commits.napoleon;

public abstract class ChessBoardAbstractClass {
	
	// The abstract 'keyword' is necessary in a abstract class
	public abstract void rotateBoard();
	
	public void whoMovesFirst() {
		System.out.println("The white piece ALWAYS moves first");
	}
}
