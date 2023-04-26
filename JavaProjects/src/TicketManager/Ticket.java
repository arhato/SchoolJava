package TicketManager;/*
 * Class: TicketManager.Ticket
 *
 * Student Name: Arrhat Maharjan
 * Student Number: 3091663
 * Date: 30/10/2022
 *
 * DO NOT EDIT ANYONE CODE IN THIS FILE
 */

class Ticket{
	private final int a, b;

	Ticket(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int a(){
		return a;
	}

	public int b(){
		return b;
	}

	public String toString(){
		return "["+a+","+b+"]";
	}
}