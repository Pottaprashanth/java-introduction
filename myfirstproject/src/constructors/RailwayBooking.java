package constructors;

import java.util.Scanner;

class Railway {

    String passengerName;
    int age;
    String source;
    String destination;

    Railway(String passengerName, int age, String source, String destination) {
        this.passengerName = passengerName;
        this.age = age;
        this.source = source;
        this.destination = destination;
    }
}

class Ticket1 extends Railway {

    int noOfTicket;
    double price = 500;

    

    Ticket1(String passengerName, int age, String source,
           String destination, int noOfTicket) {

        super(passengerName, age, source, destination);
        this.noOfTicket = noOfTicket;
    }

    void bookTicket() {

        double totalAmount = noOfTicket * price;

        System.out.println("Ticket Booking Successful!");
        System.out.println("Total Amount is: " + totalAmount);
    }

    void displayBookingDetails() {

        System.out.println("--------- Booking Details ----------");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Passenger Age: " + age);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Number of Tickets: " + noOfTicket);
        System.out.println("Price per Ticket: " + price);
        System.out.println("Total Amount is: " + (noOfTicket * price));
    }
}

public class RailwayBooking {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name Of Passanger:");
String n=sc.next();
System.out.println("Enter Age Of Passanger:");
int a=sc.nextInt();
System.out.println("Enter Source:");
String p=sc.next();
System.out.println("Enter Destination:");
String d=sc.next();
System.out.println("Enter No of Ticket:");
int nt=sc.nextInt();




        Ticket1 t = new Ticket1(n,a,p,d,nt);

        t.bookTicket();
        t.displayBookingDetails();
    }
}