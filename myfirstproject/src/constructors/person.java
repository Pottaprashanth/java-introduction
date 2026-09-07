package constructors;

public class person {
	String name;
	int age;
	person(){
		System.out.println("Person no-arg constructor");
	}
	person(String name){
		this.name=name;
		System.out.println("Person 1-arg constructor");
		
	}
	person(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("Person 2-arg constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class Employees extends person {

int empid;
double salary;
Employees(){
	super();
	System.out.println("Employee No-arg constructor");
	
	
}
Employees(String name){
	super(name);
	System.out.println("Employee 1-arg constructor");
}
Employees(String name,int age,int empid,double salary){
	super(name,age);
	this.empid=empid;
	this.salary=salary;
	System.out.println("Employee 4-arg constructor");
	
}
	public static void main(String[] args) {
		Employees e1=new Employees();
		Employees e2=new Employees("Raju");
		Employees e=new Employees("Prashath",22,101,50000);
		System.out.println("Name:"+e.name);
		System.out.println("Name:"+e2.name);
		System.out.println("Age:"+e.age);
		System.out.println("Emp Id:"+e.empid);
		System.out.println("Salary:"+e.salary);

	}

}
