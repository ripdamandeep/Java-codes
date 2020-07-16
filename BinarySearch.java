import java.util.*;
public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,c=0,a[],n,t,mid,u,l,e,flag=0,z;
		a = new int[100];
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		e=in.nextInt();
		u=a[n-1];
		l=a[0];
		while(u>=l)
		{
			mid=(u+l)/2;
			if(mid==e)
			{
				z=mid-1;
				System.out.print("Element"+" "+e+" "+"found at"+" "+z);
				break;
				
			}
			else if(mid>e)
			{
				u=mid-1;
			}
			else if(mid<e)
			{
				l=mid+1;
			}
			
		}

	}

}
