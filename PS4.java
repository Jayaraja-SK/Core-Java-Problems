import java.util.*;
import java.lang.*;

public class PS4 {
	public static int maxValue(int arr[], int n) {
		if(n==1)
		{
			return arr[0];
		}

		return Math.max(arr[n-1],maxValue(arr,n-1));
	}


	public static int fibonaaci(int n) {
		if(n==0)
		{
			return 0;
		}

		if(n==1)
		{
			return 1;
		}

		return fibonaaci(n-1)+fibonaaci(n-2);
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("ENTER ARRAY = ");

		String arr_str = sc.nextLine();

		String arr_str_1[] = arr_str.split(" ");

		int arr[] = new int[arr_str_1.length];

		int i;

		for(i=0;i<arr_str_1.length;i++)
		{
			arr[i] = Integer.parseInt(arr_str_1[i]);
		}

		System.out.println("MAX VALUE IN ARRAY = " + maxValue(arr,arr.length));

		System.out.println();

		System.out.print("ENTER NUM = ");

		int num = sc.nextInt();

		System.out.println("FIBONACCI = " + fibonaaci(num));
	}	
}