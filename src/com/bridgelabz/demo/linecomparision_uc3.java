package com.bridgelabz.demo;
import java.util.Scanner;
public class linecomparision_uc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x1=0,x2=0,y1=0,y2=0;
		System.out.println("Enter x1,x2,y1,y2 values");
		
		System.out.println("x1");
		x1= sc.nextInt();
		
		System.out.println("x2");
		x2= sc.nextInt();
		
		System.out.println("y1");
		y1= sc.nextInt();
		
		System.out.println("y2");
		y2= sc.nextInt();
		
		int length1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		Integer len1=length1;
		System.out.println("Length of line=" +length1);
		
		int p1,p2,q1,q2;
		System.out.println("Enter p1,p2,q1,q2 values");
		
		System.out.println("p1");
		p1= sc.nextInt();
		
		System.out.println("p2");
		p2= sc.nextInt();
		
		System.out.println("q1");
		q1= sc.nextInt();
		
		System.out.println("q2");
		q2= sc.nextInt();
		int length2=(int)Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
		Integer len2=length2;
		System.out.println("Length of line=" +length2);
		int res=len1.compareTo(len2);
		if(res ==0) {
			System.out.println("Two lines are equal");
		}
		else if (res>0)
		{
			System.out.println("One Length is Greater");
		}
		else
		{
			System.out.println("One length is lesser");

		}
		
	}
}


