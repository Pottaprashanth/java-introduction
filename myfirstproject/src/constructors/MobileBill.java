package constructors;

import java.util.Scanner;

public class MobileBill {
String mobileModel;
	double price;
	int quantity;
	double delivaryCharge;
	double mobileCost;
	double finalBill;

	MobileBill() {
		this(0);
		System.out.println("No-arg constructor called");
	}

	public MobileBill(double price) {
		this(price, 0);
		System.out.println("1-arg constructor called");

	}

	public MobileBill(double price, int quantity) {
		this(price, quantity, 0);
		
		System.out.println("2-arg constructor called");
	}

	public MobileBill(double price, int quantity, double delivaryCharge) {

		
		this.price=price;
		this.quantity=quantity;
		this.delivaryCharge=delivaryCharge;
		mobileCost = price * quantity;
		System.out.println("Mobile cost:"+mobileCost);
		finalBill = mobileCost + delivaryCharge;
		System.out.println("Final Bill:"+finalBill);
		System.out.println("3-arg constructor called");
	}

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     
     System.out.println("Enter Mobile Model:");
     String m=sc.next();
     System.out.println("Enter price of Mobile:");
     double p=sc.nextDouble();
     System.out.println("Enter quantity of Mobile:");
     int q=sc.nextInt();
     System.out.println("Enter Delivery charges:");
     double d=sc.nextDouble();
     MobileBill m1=new MobileBill(p,q,d);
    
  
     
     
     
	}

}
