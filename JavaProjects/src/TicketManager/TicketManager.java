package TicketManager;/*
 * Class: TicketManager.TicketManager
 *
 * Student Name: Arrhat Maharjan
 * Student Number: 3091663
 * Date: 30/10/2022
 *
 * Uncomment and fill in the 5 methods below
 */

class TicketManager{
	private Ticket[] tickets;
	private int sold = 0;
	private int maxTickets = 500;

	TicketManager(){
		tickets = new Ticket[maxTickets];
	} //constructor with array of size maxTickets

	public boolean buy(Ticket ticket){
		// Add the ticket to the next available slot in the list
		if(sold<maxTickets-1){  //since array is 0-499
			tickets[sold]=ticket;  //adding new ticket
			sold++;
			return true;  //return validation
		}else{
			return false; //return validation
		}
	}

	public boolean buy(){
		// Generate and add the ticket to the next available slot in the list
		if(sold<maxTickets-1){
			tickets[sold]=new Ticket((int)(Math.random()*5),(int)(Math.random()*5)); //new random ticket
			sold++;
			return true;  //return validation
		}else{
			return false; //return validation
		}
	}

	public int freqWinner(Ticket ticket){
		// Count how many tickets match the winning ticket drawn
		int count=0;
		int i=0;
		//looping until there is a empty element
		while(tickets[i]!=null){ //
			if(tickets[i].a()==ticket.a() && tickets[i].b()==ticket.b()) { //
				//count increment
				count++;
			}
			//index increment
			i++;
		}
		return count;
	}

	public boolean search(Ticket ticket){
		// return true if a matching ticket is in the list
		int count=0;
		for(int i=0;i<maxTickets-1;i++){ //looping full length of the tickets array
			if(tickets[i]==ticket){
				count++;   //keeping count
			}
		}
		if(count>0){
			return true;  //return validation
		}else{
			return false; //return validation
		}
	}

	public int sold(){
		// The number of tickets sold
		return sold;
	}

	public boolean allsold(){
		// Return true if all tickets have been sold
		if (sold>=499){
			return true; //return validation
		}else{
			return false;//return validation
		}
	}

	public Ticket[] getWinners(Ticket ticket){
	// Return a list of all tickets that match the winning ticket drawn
	// Do not break encapsulation!
		Ticket[] winners = new Ticket[freqWinner(ticket)];
		int winnerIndex=0;
		int i=0;
		//looping until there is a empty element
		while(tickets[i] !=null){
			if(tickets[i].a()==ticket.a() && tickets[i].b()==ticket.b()) {
				//storing winning ticket in the new array
				winners[winnerIndex]=tickets[i];
				winnerIndex++;
			}
			//index increment
			i++;
		}
		return winners; //returning the array
	}

	//do not edit
	public String toString(){
		if(sold == 0)
			return "[]";

		String s = "[";
		for(int j = 0; j < sold - 1; j++) {
			s = s + tickets[j] + ",";
		}
		return s+tickets[sold-1]+"]";
	}
}