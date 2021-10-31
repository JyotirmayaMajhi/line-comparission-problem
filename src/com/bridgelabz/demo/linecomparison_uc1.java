package com.bridgelabz.demo;
import java.util.Scanner;
public class linecomparison_uc1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
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
		
		int length=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of line=" +length);
		

	}

}
