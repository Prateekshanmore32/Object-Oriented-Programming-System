/*Alice is a kindergarten teacher. She wants to give some candies to 
the children in her class.  All the children sit in a line and each 
of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.
For example, assume her students' ratings are [4, 6, 4, 5, 6, 2].
She gives the students candy in the following minimal amounts:
[1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies. */


package opps;
import java.util.*;
public class HackerrankProblem {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		long c[]=new long[n];
		Arrays.fill(c,1);
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				c[i]=c[i-1]+1;
			}
		}
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>a[i+1])
			{
				c[i]=Math.max(c[i], c[i+1]+1);
			}
		}
		long sum=0;
		for(long x:c)
		{
			sum+=x;
		}
		System.out.println(sum);
	}

}
//5
//1
//2
//3
//4
//1
//11
