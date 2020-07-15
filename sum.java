import java.util.*;
public class sum {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,c=0,a[],n;
		a = new int[100];
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			c=c+a[i];
		}
		System.out.print(c);

	}

}
