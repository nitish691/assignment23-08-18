import java.util.*;
public class Q3{
	public static void main(String[] x)
	{
		int arr[]=new int[10];
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements :");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		int pos=0;
		for(int i=0;i<10;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				pos=i;
			}
		}
		arr[pos]=0;
		max=0;
		for(int i=0;i<10;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Second largest element is :"+max);
	}
}