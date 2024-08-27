package com.gentech.constructor.overloading;
class SoftwareProduct
{
	SoftwareProduct(String productname)
	{
		System.out.println("product name is "+productname);
	}
	
	SoftwareProduct(int developedYear )
	{
		System.out.println("software product developed year is "+developedYear);
	}
	
	SoftwareProduct(double amount, int developedYear)
	{
		System.out.println("software amount and developed year is "+amount +", "+developedYear);
	}
	
	SoftwareProduct(float version)
	{
		System.out.println("software product latest version is "+version);
	}
	
	
	
}

public class MainDemo3 {
public static void main(String[] args) {
	SoftwareProduct s=new SoftwareProduct(2002);
	SoftwareProduct s1=new SoftwareProduct("Samsung phone");
	SoftwareProduct s2=new SoftwareProduct(35000,2002);
	SoftwareProduct s3=new SoftwareProduct(1.2f);
}
}
