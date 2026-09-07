package constructors;

public class Movie {
	String movieName;

	Movie() {
		this("Dude");
		System.out.println("Movie no-arg constructor called");

	}

	public Movie(String movieName) {
		this.movieName = movieName;
		System.out.println("Movie 1-arg constructor called");
		System.out.println("Movie Name:" + movieName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Ticket extends Movie {
	int ticketNo;
	int seatNo;

	Ticket() {
		this(1221);
		System.out.println("Ticket no-arg constructor called");
	}

	public Ticket(int ticketNo) {
		this(ticketNo, 1);
		System.out.println("Ticket 1-arg constructor called");
	}

	public Ticket(int ticketNo, int seatNo) {
		super();
		this.ticketNo = ticketNo;
		this.seatNo = seatNo;
		System.out.println("Ticket 2-arg constructor called");
		System.out.println("Ticket No:" + ticketNo);
		System.out.println("Seat No:" + seatNo);

	}

	public static void main(String arg[]) {
		Ticket t = new Ticket();
	}

}
