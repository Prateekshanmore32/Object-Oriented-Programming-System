package opps;
import java.util.*;
public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,-1,-9,0};
		int b[]= {-9,7,3,4,0,8,6};
		Arrays.sort(a);
		Arrays.sort(b);
		int i=0;
		int j=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])i++;
			else if(b[j]<a[i])j++;
			else
			{
				System.out.print(b[j]+" ");
				i++;
				j++;
			}
		}
	}

}
//-9 0 3 4 