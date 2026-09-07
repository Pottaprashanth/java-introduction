package constructors;

public class Employee {
	int empid;
	String empname;
	int age;

	// No arg constructor

	Employee() {
		// Calls the 1-argument constructor
		this(101);
		System.out.println("No arg Constructor called");
//		empid=101;
//		empname="prashanth";
//		age=22;

	}
	// 1 arg constructor

	Employee(int empid) {
		// Calls the 2-argument constructor
		// Passes empid and a default name "Sundar"
		this(empid, "Sundar");

		// Does NOT initialize empid directly here
//		this.empid=empid;
		System.out.println("1 arg Constructor called");

	}
	// 2 arg constructor

	Employee(int empid, String empname) {
		// Does NOT initialize variables directly here
//		this.empid=empid;
//		this.empname=empname;

		// Calls the 3-argument constructor
		// Passes empid, empname and default age 25
		this(empid, empname, 25);
		System.out.println("2 arg Constructor called");

	}

	// 3 arg constructor
	Employee(int empid, String empname, int age) {
		System.out.println("3 arg Constructor called");
		// final initialization
		this.empid = empid;
		this.empname = empname;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
//		Employee e1=new Employee(101);
//		Employee e2=new Employee(101,"Raju");
		System.out.println("Employee id:" + e.empid);
		System.out.println("Employee Name:" + e.empname);
		System.out.println("Employee Age:" + e.age);
//		System.out.println("Employee id:"+e1.empid);
//		System.out.println("Employee Name:"+e2.empname);

	}

}
