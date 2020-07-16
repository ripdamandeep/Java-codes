import java.util.*;
public class LinearSearch {

	public static void main(String[] args) 
	{
		int n,a[],d,j=0,i;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
        a = new int[100];
        for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
        d=in.nextInt();
		for(i=0;i<a.length;i++)
		{
			if(a[i]==d)
			{

				j=i;
			}
		}
		System.out.print(d+" " +"occured" +" " + "at"+" " + j);

	}

}