package com.commits.napoleon.behavioral;

public class Knight extends ChessPiece{
	
	public Knight(ChessBoard cb) {
		this.board = cb;
		this.board.add(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("The knight moves in an L shape");
		
	}

}
