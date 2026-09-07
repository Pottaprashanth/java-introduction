package constructors;

public class Product {

	String productName;
	int price;

	Product() {
		this("Milk");
		System.out.println("Product No-arg constructor called");
	}

	Product(String productName) {
		this(productName, 15);
		System.out.println("Product 1-arg constructor called");
	}

	Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
		System.out.println("Product 2-arg constructor called");
	}

}

class Order extends Product {
	int orderId;
	int quantity;

	Order() {
		this(101);
		System.out.println("order no-arg constructor called");

	}

	public Order(int orderId) {
		this(orderId, "Milk");
		System.out.println("order 1-arg constructor called");
	}

	public Order(int orderId, String productName) {
		this(orderId, productName, 15);
		System.out.println("order 2-arg constructor called");

	}

	public Order(int orderId, String productName, int price) {
		super(productName, price);
		this.orderId = orderId;
		this.quantity = 2;
		System.out.println("order 3-arg constructor called");
	}

	void displayOrderDetails() {
		System.out.println("********* Order details ***********");
		System.out.println("Order Id:" + orderId);
		System.out.println("Product name:" + productName);
		System.out.println("Product Price:" + price);
		System.out.println("Quantity:" + quantity);
	}

	public static void main(String[] args) {
		Order r = new Order();
		r.displayOrderDetails();
	}

}
