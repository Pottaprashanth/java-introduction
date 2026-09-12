package constructors;

public class MovieTheater {
	String movieName;
	String language;
	float ticketPrice;
	MovieTheater(String movieName,String language,float ticketPrice){
		this.movieName=movieName;
		this.language=language;
		this.ticketPrice=ticketPrice;
		
	}
	MovieTheater(MovieTheater m){
		this.movieName=m.movieName;
		this.language=m.language;
		this.ticketPrice=m.ticketPrice;
	}
	void displayMovidetails() {
		System.out.println("Movie Name:"+movieName);
		System.out.println("Language:"+language);
		System.out.println("Ticket Price:"+ticketPrice +"\n");
	}
	public static void main(String[] args) {
		MovieTheater m=new MovieTheater("Epic","Telugu",200.0f);
		System.out.println("First Object Details");
		m.displayMovidetails();
		MovieTheater m1=new MovieTheater(m);
		m1.ticketPrice=300;
		System.out.println("Second Object Details");
		m1.displayMovidetails();
	}

}
