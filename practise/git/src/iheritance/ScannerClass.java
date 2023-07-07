package iheritance;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A:");
		int a=sc.nextInt();
		System.out.println("Enter the B:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
		

	}
}
//Scanner sc= new Scanner(System.in);
//System.out.println("enter the string :");
//String str= sc.next();
//System.out.println(str);