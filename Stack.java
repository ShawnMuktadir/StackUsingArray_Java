//package com.muktadirshawn;
//
//public class Stack {
//
//	int stack[]=new int[5];
//	int top=0;  //each index value is known as top
//	
//	//push is for inserting data in stack
//	public void push(int data) {
//		if(top==5) {
//			System.out.println("The stack is full!!!");
//		}
//		
//	else
//	{
//		stack[top]=data;
//		top++;
//	
//	}
//		
//	}
//	// pop is for deleting element using LIFO formula
//	public int pop() {
//		
//		int data = 0;
//		if(isEmpty()) {
//			System.out.println("The stack is empty!!!");
//		}
//		else{
//			top--;
//			data=stack[top];
//			stack[top]=0;
//			
//		}return data;
//	}
//	
//	//peek is for showing data of the latest value inserted at stack
//	
//	public int peek() {
//		int data;
//		data = stack[top-1];
//		return data;
//	}
//	
//	//showing the size of stack
//	public int size() {
//		
//		return top;
//	}
//	
//	//show the stack is empty or not
//	public boolean isEmpty() {
//		
//		return top<=0;
//	}
//	
//	public void show() {
//		
//		for(int n : stack) {
//			
//			System.out.print(n+" ");
//		}
//		System.out.println("\n");
//	}
//
//}
