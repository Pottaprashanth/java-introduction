package com.oops;

public class Customers  implements Cloneable{

	int cid;
	String cname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	public Customers(int cid, String cname, Address address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}

	
	

	public static void main(String[] args) throws CloneNotSupportedException {
     Address add=new Address("hyderabad");
	 Customers c1=new Customers(1, "Prashanth", add);
	 System.out.println(c1.cid);
	 System.out.println(c1.cname);
	 System.out.println(c1.address.city);
	 
	 Customers c2=(Customers) c1.clone();
	 c2.cid=2;
	 c2.cname="Varun";
	 c2.address.city="Pune";
	 System.out.println(c2.cid);
	 System.out.println(c2.cname);
	 System.out.println(c2.address.city);
	 
	 
	 System.out.println(c1.address.city);
	}
	}
class Address{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}
