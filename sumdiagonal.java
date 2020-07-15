import java.util.*;
public class sumdiagonal {

	public static void main(String[] args) 
	{
	 Scanner in=new Scanner(System.in);
	 int i,j,n,a[][],c=0;
	 a = new int[100][100];
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
			a[i][j]=in.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					c=c+a[i][j];
				}
			}
		}
		System.out.print("Sum of diagonal elements is "+c);
	

	}

}
