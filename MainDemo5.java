package com.gentech.constructor.overloading;


class Contract
{
	Contract(String partyname)
	{
		System.out.println("contract partyname is "+partyname);
	}
	
	Contract( int duration )
	{
		System.out.println(" contract duration is "+duration);
	}
	
	Contract( double  value )
	{
		System.out.println("contract value  is "+value);
	}
	
	Contract( String partyname,int duration )
	{
		System.out.println("contract partyname and duration is "+ partyname +", "+duration);
	}
	
		
}

public class MainDemo5 {

	public static void main(String[] args) {
	 
		Contract c=new Contract("kiran",6);
		Contract c1=new Contract(6);
		Contract c2=new Contract(50000.00);
		Contract c3=new Contract("kiran");
	}

}
