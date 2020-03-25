package com.commits.napoleon;

public class Implentation extends ChessBoardAbstractClass implements WhitePiecesInterface, BlackPiecesInterface{

	@Override
	public void rotateBoard() {
		// TODO Auto-generated method stub
		System.out.println("Rotating board...");
	}

	// We only need to override this method once!!
	@Override
	public void movePiece() {
		// TODO Auto-generated method stub
		System.out.println("Moving a chess piece...");
	}

}
