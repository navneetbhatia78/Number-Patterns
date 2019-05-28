*****************************************************************************************



                                      1 2 3 4 5 6 7 
                                      1 2 3 4 5 6 
                                      1 2 3 4 5 
                                      1 2 3 4 
                                      1 2 3 
                                      1 2 
                                      1 



*********************************************************************************************



import java.util.*;
public class Pattern5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int rows,i,j;
		System.out.println("Enter the number of rows you want to print ");
		rows=sc.nextInt();
		for(i=rows;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
