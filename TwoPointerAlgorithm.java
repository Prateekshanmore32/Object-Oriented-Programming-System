package opps;
import java.util.*;
public class TwoPointerAlgorithm {

	public static void main(String[] args) {

		int arr[]= {-4,-1,0,1,4,5,6,7};
		Arrays.sort(arr);
		int flag=0;
		for(int i=0;i<arr.length-2;i++)
		{
			if(twoSum(arr,-arr[i],i))
			{
				flag=1;
				System.out.println("Found");
				break;
			}
		}
		if(flag!=1)
		System.out.println("Not found");
	}
	
	public static boolean twoSum(int a[],int x,int i)
	{
		int j=a.length-1;
		while(i<j)
		{
			if(a[i]+a[j]<x)i++;
			else if(a[i]+a[j]>x)j--;
			else
			return true;
		}
		return false;
	}

}
//Found
