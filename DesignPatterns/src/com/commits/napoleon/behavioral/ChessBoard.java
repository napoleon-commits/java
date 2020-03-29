package com.commits.napoleon.behavioral;

import java.util.ArrayList;
import java.util.List;

// subject
public class ChessBoard {
	private List<ChessPiece> pieces = new ArrayList<ChessPiece>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		execute();
	}
	
	public void add(ChessPiece o) {
		pieces.add(o);
	}
	
	private void execute() {
		for(ChessPiece cp : pieces) {
			cp.update();
		}
	}
}
