package constructors;

public class Student {
	int s_id;
	String s_name;
	int s_age;

	Student() {
		this(101);
		System.out.println("No-arg constructor called");
	}

	public Student(int s_id) {
		this(s_id, "prashanth");
		System.out.println("2-arg constructor called");
	}

	public Student(int s_id, String s_name) {
		this(s_id, s_name, 22);
		System.out.println("3-arg constructor called");
	}

	public Student(int s_id, String s_name, int s_age) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;

	}

	public static void main(String[] args) {
		Student s = new Student();

	}

}
