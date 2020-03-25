package com.commits.napoleon;

import java.io.Serializable;
import java.util.Arrays;

public class ChessPiece implements Serializable {

	public ChessPiece(char piece, String color, int[][] location) {
		super();
		this.piece = piece;
		this.color = color;
		this.location = location;
	}

	public ChessPiece() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private char piece;
	private String color;

	private transient int location[][];

	public char getPiece() {
		return piece;
	}

	public void setPiece(char piece) {
		this.piece = piece;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int[][] getLocation() {
		return location;
	}

	public void setLocation(int[][] location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ChessPiece [piece=" + piece + ", color=" + color + ", location=" + Arrays.toString(location) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + piece;
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
		ChessPiece other = (ChessPiece) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (piece != other.piece)
			return false;
		return true;
	}

}
