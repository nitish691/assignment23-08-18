import java.util.*;
public class Q5{
	public static void main(String[] x)
	{
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int temp;
		for(int i=0;i<9;i=i+2)
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int j=0;j<10;j++)
		{
			System.out.println(arr[j]);
		}
	
	}
}