package com.commits.napoleon.creational.factory;

public class ChessPieceFactory {
	public static ChessPiece createPiece(String symbol) {
		switch(symbol) {
			case "R":
				return new Rook();
			case "N":
				return new Knight();
			case "B":
				return new Bishop();
			case "K":
				return new King();
			case "Q":
				return new Queen();
			default:
				return new Pawn();
		}
	}
}
