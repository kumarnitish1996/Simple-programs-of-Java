// This program shows how to implement multi-dimensional Array
// By - Nitish Tiwar

import java.util.Scanner;

public class MultiD_array {

	public static void main(String []args){
		
		int i,j,k=1;
					
		 Scanner s = new Scanner(System.in);
		 
	     System.out.print("Enter the no. of the rows :\t");
	     int m = s.nextInt();
	     System.out.print("Enter the no. of the columns :\t");
	     int n = s.nextInt();
	     s.close();
	     		
	     int twoD[][] = new int [m][n];
	     
	     for(i=0; i<m; i++)
			for(j=0; j<n; j++){
				twoD[i][j] = k;
				k++;
			}
				
	     for(i=0; i<m; i++){
			for(j=0; j<n; j++)
				System.out.print(twoD[i][j] + " ");
				System.out.println();
		}
	}
}
