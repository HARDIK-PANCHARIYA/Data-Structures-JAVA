package com.dsa.collection.stack;

import java.util.Stack;

public class ReverseSatck {
	
	public static void atButtom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		
		int top= s.pop();
		atButtom(data,s);
		s.push(top);
	}
	
	public static void reverse(Stack <Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top=s.pop();
		reverse(s);
		atButtom(top, s);
		
	}
	
	public static void main(String[] args) {
		Stack s= new Stack ();
		s.push(1);
		s.push(2);
		s.push(3);
		
		reverse(s);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
