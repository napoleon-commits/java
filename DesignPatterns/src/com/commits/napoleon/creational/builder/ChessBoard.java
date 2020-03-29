package com.commits.napoleon.creational.builder;

public class ChessBoard {
	
	private final int pawn;
	private final int rook;
	private final int knight;
	private final int bishop;
	private final int king;
	private final int queen;
	
	public static class Pieces{
		private int pawn;
		private int rook;
		private int knight;
		private int bishop;
		private int king;
		private int queen;
		
		public Pieces pawns(int numberOf) {
			this.pawn = numberOf;
			return this;
		}
		
		public Pieces rooks(int numberOf) {
			this.rook = numberOf;
			return this;
		}
		
		public Pieces knights(int numberOf) {
			this.knight = numberOf;
			return this;
		}
		
		public Pieces bishops(int numberOf) {
			this.bishop = numberOf;
			return this;
		}
		
		public Pieces kings(int numberOf) {
			this.king = numberOf;
			return this;
		}
		
		public Pieces queens(int numberOf) {
			this.queen = numberOf;
			return this;
		}
		
		public ChessBoard build() {
			return new ChessBoard(this);
		}
	}
	
	public ChessBoard(Pieces pieces) {
		this.pawn = pieces.pawn;
		this.rook = pieces.rook;
		this.knight = pieces.knight;
		this.bishop = pieces.bishop;
		this.king = pieces.king;
		this.queen = pieces.queen;
	}

	@Override
	public String toString() {
		return "ChessBoard [pawn=" + pawn + ", rook=" + rook + ", knight=" + knight + ", bishop=" + bishop + ", king="
				+ king + ", queen=" + queen + "]";
	}

}
