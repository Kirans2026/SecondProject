package com.gentech.abstract1.programs;

abstract class College
{
	static String CollName;
	static int collId;
	static String address;
	static
	{
		CollName="nitte";
		System.out.println("College Name :"+CollName);
		collId=1001;
		System.out.println("College Id :"+collId);
		address="Bangalore";
		System.out.println("address :"+address);
	}
	
}
class SubClass extends College
{
	
}

public class Prog2 {

	public static void main(String[] args) {
		
		
			College obj1=new SubClass();
		
	}

}
