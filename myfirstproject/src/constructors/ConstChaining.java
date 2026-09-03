package constructors;

public class ConstChaining {

	int id;
	String name;
	double sal;

	ConstChaining() {
		this(101);
		System.out.println("no arg constructor called");
	}

	ConstChaining(int id) {
		this(id, "prashanth");
		System.out.println("1 arg constructor called");
	}

	ConstChaining(int id, String name) {
		this(id, name, 12000);
		System.out.println("2 arg constructor called");

	}

	ConstChaining(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

	}

	public static void main(String[] args) {

		ConstChaining cc = new ConstChaining();
		cc.Const();

	}

	void Const() {
		System.out.println("emp id:" + id);
		System.out.println("emp name:" + name);
		System.out.println("emp sal:" + sal);

	}

}
