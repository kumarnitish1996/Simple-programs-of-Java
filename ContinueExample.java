// This program is an example of Continue Statement
// Date - 23/03/2017
// By - Nitish Tiwari

public class ContinueExample{
	public static void main(String args[]){

		int intArray[] = new int[]{1,2,3,4,5};
		System.out.println(intArray[i]);
		
		System.out.println("All nos except 3 are :");
		
		 for(int i=0; i<intArray.length; i++){
			 if(intArray[i]==3)
				 continue;	//Continue is used to skip a particular iteration of loop
			 else
				 System.out.println(intArray[i]);
		 }
	}
}