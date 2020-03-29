package com.commits.napoleon.creational.builder;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessBoard standardBoard = new ChessBoard.Pieces()
				.pawns(8).rooks(2).knights(2).bishops(2)
				.kings(1).queens(1).build();
		
		System.out.println(standardBoard);

	}

}
