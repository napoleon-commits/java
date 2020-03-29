package com.commits.napoleon.creational.prototype;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPieces board1 = new ChessPieces();
		board1.loadPieces();
		
		ChessPieces board2;
		
		board2 = (ChessPieces) board1.clone();
		
		System.out.println("board1 == board2?: " + (board1 == board2));
		System.out.println("Board1.equals(Board2)?: " + board1.equals(board2));
	}

}
