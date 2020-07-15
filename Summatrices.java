import java.util.*;
public class Summatrices {

	public static void main(String[] args) 
	{
		int i,j,n,a[][],b[][],c[][];
		a=new int[100][100];
		b=new int[100][100];
		c=new int[100][100];
		Scanner in=new Scanner(System.in);
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
				b[i][j]=in.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}

	}

}
