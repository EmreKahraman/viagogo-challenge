package model;

import java.util.ArrayList;
import java.util.Collections;

public class Event {

	private static int eventIdentifier;
	private int generateID;

	private ArrayList<Ticket> availableTickets;

	public Event() {
		generateID = ++eventIdentifier; // Generate unique ID for the event
		availableTickets = new ArrayList<Ticket>();
	}

	public String toString() {
		return "Event " + generateID;
	}

	public ArrayList<Ticket> temp() {
		return availableTickets;
	}

	public Ticket findCheapestTicket() {
		if(availableTickets.size() > 0) {
			Collections.sort(availableTickets);
			Ticket c = availableTickets.get(0);
			//System.out.println(availableTickets);
			return c;
		} else {
			return null;
		}
	}

	public void addTicket(Ticket ticket) {
		availableTickets.add(ticket);
	}

	public int getEventID() {
		return generateID;
	}

	public int getAmount() {
		return availableTickets.size();
	}

}
