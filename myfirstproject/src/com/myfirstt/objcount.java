package com.myfirstt;

 class objcount {
      static int c=0;
	 {
		
		 c++;
	}
	public static void main(String[] args) {
		objcount ob=new objcount();
		objcount ob1=new objcount();
		objcount ob2=new objcount();
		objcount ob3=new objcount();
		objcount ob4=new objcount();
		System.out.println(c );
	
	}

}
