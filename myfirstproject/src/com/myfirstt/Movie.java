package com.myfirstt;

public class Movie {
	String movieName;
	int releasedYear;
	int ticketPrice;
	public void Details() {
		System.out.println("******** Ticket Details ***********");
		System.out.println("MovieName     :"+ movieName);
		System.out.println("Released Year :"+ releasedYear);
		System.out.println("Ticket Price  :"+ ticketPrice);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Movie m1=new Movie();
		m1.movieName="RRR";
		m1.releasedYear=2025;
		m1.ticketPrice=299;
		m1.Details();
		
		Movie m2=new Movie();
		m2.movieName="Animal";
		m2.releasedYear=2024;
		m2.ticketPrice=250;
		m2.Details();
		
		Movie m3=new Movie();
		m3.movieName="Dude";
		m3.releasedYear=2026;
		m3.ticketPrice=50;
		m3.Details();

	}

}
