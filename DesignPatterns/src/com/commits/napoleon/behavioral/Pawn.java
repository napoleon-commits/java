package com.commits.napoleon.behavioral;

public class Pawn extends ChessPiece{
	
	public Pawn(ChessBoard cb) {
		this.board = cb;
		this.board.add(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("pawn moves forward, attacks diagonally");
	}

}
