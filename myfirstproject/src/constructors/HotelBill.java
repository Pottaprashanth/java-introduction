package constructors;

import java.util.Scanner;

public class HotelBill {
	int roomprice;
	int noOfDays;
	int foodCharges;
	String Rtype;

	static Scanner sc = new Scanner(System.in);

	HotelBill() {
		System.out.println("Enter Room Type:");
		String r = sc.next();
		this(r);

	}

	public HotelBill(String Rtypee) {
		System.out.println("Enter Room Price:");
		int p = sc.nextInt();
		this(Rtypee, p);
	}

	public HotelBill(String Rtypee, int roomprice) {
		System.out.println("Enter No of Days:");
		int d = sc.nextInt();
		this(Rtypee, roomprice, d);
	}

	public HotelBill(String Rtypee, int roomprice, int noOfDays) {
		System.out.println("Enter Food Charges:");
		int f = sc.nextInt();
		this(Rtypee, roomprice, noOfDays, f);

	}

	public HotelBill(String rtypee, int roomprice, int noOfDays, int foodCharges) {
		this.roomprice = roomprice;
		this.noOfDays = noOfDays;
		this.foodCharges = foodCharges;
		this.Rtype = Rtype;
		int roomCost = roomprice * noOfDays;
		int finalBill = roomCost + foodCharges;
		System.out.println("------ Hotel Bill ------");
		System.out.println("Room Type:" + Rtype);
		System.out.println("Room Price:" + roomprice);
		System.out.println("No of Days:" + noOfDays);
		System.out.println("Food Charges:" + foodCharges);
		System.out.println("Room Cost:" + roomCost);
		System.out.println("Final Bill:" + finalBill);
	}

	public static void main(String[] args) {

		HotelBill hb = new HotelBill();

	}

}
