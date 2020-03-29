package com.commits.napoleon.creational.factory;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPiece cp = ChessPieceFactory.createPiece("P");
		System.out.println(cp.getSymbol());
		cp = ChessPieceFactory.createPiece("R");
		System.out.println(cp.getSymbol());
		cp = ChessPieceFactory.createPiece("N");
		System.out.println(cp.getSymbol());
		cp = ChessPieceFactory.createPiece("B");
		System.out.println(cp.getSymbol());
		cp = ChessPieceFactory.createPiece("K");
		System.out.println(cp.getSymbol());
		cp = ChessPieceFactory.createPiece("Q");
		System.out.println(cp.getSymbol());
	}

}
