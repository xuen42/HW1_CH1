package test;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class practice2
{

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		System.out.print("歡迎使用java！"); //		pg9
		
		System.out.println("changing lines"); // 	pg10
		
		System.out.println(123);//					pg16
		
		System.out.println("顯示出反斜號 \\");//		pg18
		System.out.println("顯示出單引號'");
		System.out.println("八進位101是\101");
		System.out.println("十六進位0061是\u0061");
		
		int num1,num2;
		num1=3;
		System.out.println("Variable num is " +num1);// pg25
		
		num1=5;
		System.out.println("Now the changed variable is " +num1); //pg26
		
		num2=num1;
		System.out.println("The variable num2 has change to "+num2);//pg27
		
		System.out.println("Input a number:");
		BufferedReader br1 =
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int num3 = Integer.parseInt(str1);
		System.out.println("Your input number is: " +num3);
		System.out.println("Input a String:");
		BufferedReader br2 =
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		System.out.println("Your input string is : " +str2); //pg28
		
		System.out.println("1 + 2 = "+(1+2));
		System.out.println("2 * 3 = "+(2*3));
		int sum=num1+num2;
		System.out.println("num1 is "+num1);
		System.out.println("num2 is "+num2);
		System.out.println("num1 + num2 is "+sum);
		num1 = num1 + num3;
		System.out.println("num1 has changed to "+num1); //pg31
		
		System.out.println("Various operation of num1 and num2");
		System.out.println("num1 + num2 = "+(num1+num2));
		System.out.println("num1 - num2 = "+(num1-num2));
		System.out.println("num1 * num2 = "+(num1*num2));
		System.out.println("num1 / num2 = "+(num1/num2));
		System.out.println("num1 % num2 = "+(num1%num2));
		int a=0;
		int b=0;
		int c=0;
		b=a++;
		c=++a;
		System.out.println("Let a,b,c = 0");
		System.out.println("Originally b is 0, after b=a++. now b is "+b);
		System.out.println("Originally c is 0, after c=++a. now c is "+c);//pg4

		double dnum=160.5;
		System.out.println("Height "+dnum+"cm");
		int inum = (int)dnum;
		System.out.println("Height "+inum+"cm");//pg38
		
		double pi=3.14;
		System.out.println("Diameter "+num3+"cm of circle");
		System.out.println("Circumference is "+(num3*pi)+"cm");
		double div1=num1/num2;
		double div2=(double)num1/(double)num2;
		System.out.println(+num1+ "/"+num2+ " = " +div1);
		System.out.println(+num1+ "/"+num2+ " = " +div2);//pg39
	}

}
