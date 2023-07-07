package strings.practice;
//	import java.util.Scanner;
//
//	public class Xoxo {
//
//	    public static void main(String[] args) {
//	        Scanner scan = new Scanner(System.in);
//	       
//	       int i = 100; 
//	         double d = 42d; 
//	         String s = "42 is the answer to life, the universe, and everything!";
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
//	        scan.nextInt();  
//	    }
//	}


import java.io.*;
import java.util.*;

public class Xoxo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder(A);{
            sb.reverse() ;
            String rev=sb.toString();
          if(A.equals(rev)){
              System.out.println("YES");
          }else {
        	  System.out.println("NO");
          }
      
        }
    }    
}


