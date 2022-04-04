import java.util.*;
class Complex
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,f;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the real part of first complex no:");
		a=s.nextInt();
		System.out.println("enter the imaginary part of first complex no:");
		b=s.nextInt();
		System.out.println("enter the real part of second complex no:");
		c=s.nextInt();
		System.out.println("enter the imaginary part of second complex no:");
		d=s.nextInt();
		e=a+c;
		f=b+d;
		System.out.println("Sum of given complex number is  : "+e+"+"+f+"i");
	}
}