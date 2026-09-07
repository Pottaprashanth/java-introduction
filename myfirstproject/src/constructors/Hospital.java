package constructors;

public class Hospital {
	String HsptlName;

	Hospital() {
		this("Yashoda");
		System.out.println("Hospital No-arg constructed called");
	}

	public Hospital(String HsptlName) {
		this.HsptlName = HsptlName;
		System.out.println("Hospital 1-arg constructed called");

	}

}

class Doctor extends Hospital {
	String specilazation;

	Doctor() {
		this("NeroSurgen");
		System.out.println("Doctor No-arg constructed called");

	}

	public Doctor(String specilazation) {
		super();
		this.specilazation = specilazation;

		System.out.println("Doctor 1-arg constructed called");
	}

	public static void main(String[] args) {

		Doctor d = new Doctor();

	}

}
