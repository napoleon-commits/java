package com.commits.napoleon.creational.prototype;

import java.util.ArrayList;

public class ChessPieces implements Cloneable{
	private ArrayList<String> pieces;
	
	public ChessPieces() {
		pieces = new ArrayList<String>();
	}
	
	public ChessPieces(ArrayList<String> list) {
		this.pieces = list;
	}
	
	public void loadPieces() {
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("P");
		pieces.add("R");
		pieces.add("R");
		pieces.add("N");
		pieces.add("N");
		pieces.add("B");
		pieces.add("B");
		pieces.add("K");
		pieces.add("Q");
	}
	
	public ArrayList<String> getChessPieceList(){
		return pieces;
	}
	
	@Override
	public Object clone() {
		ArrayList<String> temp = new ArrayList<String>();
		
		for(String s : this.getChessPieceList()) {
			temp.add(s);
		}
		
		return new ChessPieces(temp);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pieces == null) ? 0 : pieces.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChessPieces other = (ChessPieces) obj;
		if (pieces == null) {
			if (other.pieces != null)
				return false;
		} else if (!pieces.equals(other.pieces))
			return false;
		return true;
	}
}
