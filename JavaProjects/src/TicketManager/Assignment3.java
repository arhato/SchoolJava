package TicketManager;/*
 * Class: TicketManager.MergeInsertionSort.Assignment3
 *
 *  Student Name: Arrhat Maharjan
 * Student Number: 3091663
 * Date: 30/10/2022
 *
 * Friends.Test class for Assignment 3
 *
 */

import java.util.*;
public class Assignment3{
	public static void main(String args[]){

		// Q1  ==============================================
		// This code is a sample test for Q2. You will need to add more tests to test all methods

		TicketManager tm = new TicketManager();
     	System.out.println(tm);
     	Ticket t1 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	tm.buy(t1);
     	System.out.println(tm);
     	Ticket t2 = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));
     	tm.buy(t2);
     	System.out.println(tm);
     	for(int j = 0; j < 200; j++) {
     		tm.buy(new Ticket((int)(Math.random()*5),(int)(Math.random()*5)));
     	}
     	System.out.println("Tickets sold: " + tm.sold());   //should have 202 sold
     	Ticket draw = new Ticket((int)(Math.random()*5),(int)(Math.random()*5));

		System.out.println("The draw is: " + draw.toString()); //printing draw for testing

		//testing other methods in TicketManager.TicketManager

		//testing freqWinners() method
		//buying the same ticket as the winning draw
		tm.buy(draw); //sold tickets increase by 1
		System.out.println("Tickets sold: " + tm.sold());  //should have 203 sold
		System.out.println("Number of matching tickets are: " + tm.freqWinner(draw));//should have at least 1 match

		//testing buy() method
		System.out.println("Was a new ticket added?: " + tm.buy()); //sold tickets increase by 1
		System.out.println("Tickets sold: " + tm.sold());//should have 204 sold

		//testing search() method
		System.out.println("Is there a matching ticket: " + tm.search(t1));  //should be true
		Ticket outofBoundTicket=new Ticket(6,7);  //getting a out of bound ticket for testing
		System.out.println("Is there a matching ticket: " + tm.search(outofBoundTicket));//should be false

		//testing allsold() method
		System.out.println("Are all tickets sold: " + tm.allsold()); //should be  false
		//buying all tickets
		for(int j = 0; j < 300; j++) {
			tm.buy(new Ticket((int)(Math.random()*5),(int)(Math.random()*5)));
		}
		System.out.println("Are all tickets sold: " + tm.allsold());  //should be true now

		//testing getWinners() method
		//printing winning tickets
		System.out.println("Number of WINNING tickets are: " + tm.freqWinner(draw)); //for testing purpose
		System.out.println("The list of winning tickets are: ");
		System.out.println(Arrays.toString(tm.getWinners(draw)));


	}
}