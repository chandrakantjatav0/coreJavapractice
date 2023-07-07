package stack;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A"); //inserting an object to stack
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		System.out.println("A");
		System.out.println(s.search("Z"));
		s.pop();//LIFO WILL APPLIED IN POP
		System.out.println(s);
		s.push("D");
		System.out.println(s);
		//peek method top of the object willl remove
		System.out.println(s.peek());
		System.out.println(s.pop());
	}
}
