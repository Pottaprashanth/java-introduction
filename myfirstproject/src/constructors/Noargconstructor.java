package constructors;

public class Noargconstructor {
	int x;
	int y;

	Noargconstructor() {
		System.out.println("No Arg Constructor called");
		x = 10;
		y = 12;
	}

	public static void main(String[] args) {
		Noargconstructor nc = new Noargconstructor();
		System.out.println("Num1:" + nc.x);
		System.out.println("Num2:" + nc.y);

	}

}
