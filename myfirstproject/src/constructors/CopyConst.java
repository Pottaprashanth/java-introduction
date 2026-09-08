package constructors;

public class CopyConst {
	int id;
	String name;
	CopyConst(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	CopyConst(CopyConst s){
		this.id=s.id;
		this.name=s.name;
	
	}

	public static void main(String[] args) {
		CopyConst c=new CopyConst(101,"Prashanth");
		
		CopyConst c1=new CopyConst(c);
		System.out.println(c.id);
		System.out.println(c.name);
		System.out.println(c1.id);
		System.out.println(c1.name);
		System.out.println(c);
		System.out.println(c1);

	}

}
