package com.commits.napoleon.behavioral;

/*
 * Observer design pattern guidelines:
 * 		1) Model the "independent" functionality with a "subject" abstraction
 * 		2) Model the "dependent" functionality with "observer" hierarchy
 * 		3) The Subject is coupled only to the Observer base class
 * 		4) Observers register themselves with the Subject
 * 		5) The Subject broadcasts events to all registered Observers
 * 		6) Observers "pull" the information they need from the Subject
 * 		7) Client configures the number and type of Observers
 */

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessBoard cb = new ChessBoard();
		
		new Pawn(cb);
		new Knight(cb);
		
		cb.setState(0);
	}

}
