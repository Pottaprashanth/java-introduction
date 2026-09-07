package constructors;

public class Person11 {
	String pname;
	int page;
	Person11(){
		System.out.println(" Person No-arg constructor called");
		
	}
	Person11( String pname){
		this.pname=pname;
		System.out.println("Person 1-arg constructor called");
		
		
	}
Person11(String pname,int page){
		this.pname=pname;
		this.page=page;
		System.out.println("Person 2-arg constructor called");
	}
	
}
class Employee11 extends Person11{
	int empid;
	double salary;
	Employee11(){
		this(101);
		System.out.println("Employee No-arg constructor called");
	}
	Employee11(int empid){
		this(empid,"prashanth");
		System.out.println("Employee 1-arg constructor called");
	}
	Employee11(int empid,String pname){
		this(empid,pname,22);
		System.out.println("Employee 2-arg constructor called");
	}
	Employee11(int empid,String pname,int page){
		super(pname,page);
		this.empid=empid;
		this.pname=pname;
		this.page=page;
		this.salary=500000;
		System.out.println("Employee 3-arg constructor called");
	}
	

	public static void main(String[] args) {
		
Employee11 e=new Employee11();
System.out.println("Name:"+e.pname);
//System.out.println("Name:"+e.name);
System.out.println("Age:"+e.page);
System.out.println("Emp Id:"+e.empid);
System.out.println("Salary:"+e.salary);
	}

}
