package com.muktadirshawn;

public class Runner {

	public static void main(String[] args) {
		
		Stack nums=new Stack();
		//System.out.println("Empty =  "+nums.isEmpty());
		nums.push(15);
		nums.show();
		nums.push(8);
		nums.show();
		
		//System.out.println("The current element inserted was: "+nums.peek());		
		
		nums.push(10);
		nums.show();
		nums.push(7);
		nums.show();
		nums.push(30);
		nums.show();
		nums.push(300);
		nums.show();
		
		//System.out.println("The size of stack is: "+nums.size());
		
		//System.out.println("Empty =  "+nums.isEmpty());
		
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		System.out.println(nums.pop());
		
		
		nums.show();
		
		

	}

}
