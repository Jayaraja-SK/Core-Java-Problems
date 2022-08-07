import java.util.*;
import java.lang.*;

class Number {
	private double numD;
	private int numI;

	public Number(double numD) {
		this.numD = numD;
		this.numI = (int)numD;
	}

	public boolean isZero() {
		if(numI == 0)
		{
			return true;
		}

		return false;
	}

	public boolean isPositive() {
		if(numI >= 0)
		{
			return true;
		}

		return false;
	}

	public boolean isNegative() {
		if(numI < 0)
		{
			return true;
		}

		return false;
	}

	public boolean isOdd() {
		if(numI%2 == 1)
		{
			return true;
		}

		return false;
	}

	public boolean isEven() {
		if(numI%2 == 0)
		{
			return true;
		}

		return false;
	}

	public boolean isPrime() {
		int i;

		if(numI<=1)
		{
			return false;
		}
		else if(numI==2)
		{
			return true;
		}

		for(i=2;i<numI;i++)
		{
			if(numI%i==0)
			{
				return false;
			}
		}

		return true;
	}

	public boolean isArmstrong() {
		int sum = 0;
		int temp = numI;

		while(temp>0)
		{
			sum = sum+((temp%10)*(temp%10)*(temp%10));
			temp=temp/10;
		}

		if(sum==numI)
		{
			return true;
		}

		return false;
	}

	public double getFactorial() {
		double res = 1;
		int temp = numI;

		if(temp<=0)
		{
			return 0;
		}

		while(temp>0)
		{
			res=res*temp;
			temp=temp-1;
		}

		return res;
	}

	public double getSqrt() {
		return Math.sqrt(numD);
	}

	public double getSqr() {
		return Math.pow(numD,2);
	}

	public double sumDigits() {
		double sum = 0;
		int temp = numI;

		while(temp>0)
		{
			sum = sum+(temp%10);
			temp=temp/10;
		}

		return sum;
	}

	public double getReverse() {
		double res = 0;
		int temp = numI;

		while(temp>0)
		{
			res = (res*10)+((temp%10));
			temp=temp/10;

			System.out.println(res);
		}

		return res;
	}

	public void listFactors() {
		int i;

		System.out.print("FACTORS = ");
		
		for(i=1;i<=numI/2;i++)
		{
			if(numI%i==0)
			{
				System.out.print(i + ", ");
			}
		}

		System.out.println();
	}

	public void dispBinary() {
		System.out.println("BINARY VALUE = " + Integer.toBinaryString(numI));
	}
}

public class PS2 {
	public static void main(String args[]) {
		double num = 6.20;

		Number n = new Number(num);

		System.out.println("IS-ZERO = " + n.isZero());
		System.out.println("IS-POSITIVE = " + n.isPositive());
		System.out.println("IS-NEGATIVE = " + n.isNegative());
		System.out.println("IS-ODD = " + n.isOdd());
		System.out.println("IS-EVEN = " + n.isEven());
		System.out.println("IS-PRIME = " + n.isPrime());
		System.out.println("IS-ARMSTRONG = " + n.isArmstrong());

		System.out.println("GET-FACTORIAL = " + n.getFactorial());
		System.out.println("GET-SQUARE ROOT = " + n.getSqrt());
		System.out.println("GET-SQUARE = " + n.getSqr());
		System.out.println("GET-SUM OF DIGITS = " + n.sumDigits());
		System.out.println("GET-REVERSE = " + n.getReverse());

		n.listFactors();
		n.dispBinary();
	}
}