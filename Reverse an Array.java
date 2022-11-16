/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] arr = new int[n];
		    for(int k=0;k<n;k++)
		    {
		        a[k]=sc.nextInt();
		    }
		    for(int j=n-1;j>=0;j--)
		    {
		        arr[j]=a[j];
		    }
		    for(int x=n-1;x>=0;x--)
		    {
		    System.out.print(arr[x]+" ");
		    }
		    System.out.println();
		}
	}
}
