package com.gentech.abstract1.programs;

abstract class College1
{
	String CollName;
	int collId;
	String address;
	
	{
		CollName="nitte";
		System.out.println("College Name :"+CollName);
		collId=1;
		System.out.println("College Id :"+collId);
		address="Bangalore";
		System.out.println("address :"+address);
	}
}
class College2 extends College1
{
	
}

public class Prog3 {
	public static void main(String[] args) {
		College2 ob1=new College2();
	}
}
