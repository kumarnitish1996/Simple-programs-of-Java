// This program shows how to create & call constructors
// Date - 30/03/2017
// By - Nitish Tiwari

class constructor
{
	constructor()	//Constructor name must be same as the class name
	{
		System.out.println("Welcome");
	}
	
	public static void main(String args[]){
		
		constructor a1	=	new constructor();   // callng constructor
		constructor a2	=	new constructor();
		constructor a3	=	new constructor();
		constructor a4	=	new constructor();	
	}
}