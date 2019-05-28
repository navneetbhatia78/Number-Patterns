****************************************************************************************


                                  7 6 5 4 3 2 1 
                                  7 6 5 4 3 2 
                                  7 6 5 4 3 
                                  7 6 5 4 
                                  7 6 5 
                                  7 6 
                                  7
                                  
                                  

******************************************************************************************


import java.util.*;

public class Pattern4 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int rows,i,j;
System.out.println("Enter the number of rows you want to print");
rows=scan.nextInt();
for(i=1;i<=rows;i++)
{
	for(j=rows;j>=i;j--)
	{
		System.out.print(j);
		System.out.print(" ");
		
	}
	System.out.println();
	}

	}

}

