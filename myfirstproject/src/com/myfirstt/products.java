package com.myfirstt;

public class products {
	int product_id;
	String product_name;
	int product_price;
	String product_info;
	static String company;
	void show() {
		System.out.println("PRODUCTS DETAILS");
		System.out.println("productid :"+ product_id);
		System.out.println("productname :"+ product_name);
		System.out.println("productPrice :"+ product_price);
		System.out.println("productinfo :"+ product_info);
		System.out.println("company :"+ company);
	}
	

	public static void main(String[] args) {
		products p1=new products();
		p1.product_id=101;
		p1.product_name="milk";
		p1.product_price=40;
		p1.product_info="1ltr";
		company="ammul milk";
		p1.show();
		products p2=new products();
		p2.product_id=102;
		p2.product_name="chicken";
		p2.product_price=300;
		p2.product_info="5kgs";
		company="senha";
		p2.show();
		
	}

}
