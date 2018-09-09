package com.muktadirshawn;

public class DynamicStack {
	
		int capacity=2;
		int stack[]=new int[capacity];
		
		int top=0;  //each index value is known as top
		
		//push is for inserting data in stack
		public void push(int data) {
			
			if (size()==capacity) {
				expand();
			}
			
			stack[top]=data;
			top++;
		
		}
		
		private void expand() {
			int length = size();
			int newStack[] = new int[capacity*2];
			
			System.arraycopy(stack, 0, newStack, 0, length); //previous array name,start index,new array name,
															 //start index of the new array,and how many indexes you want yo copy
															 //here we want the full length of that stack array to be copied
			stack = newStack;
			capacity*=2;
		}

		// pop is for deleting element using LIFO formula
		public int pop() {
			
			int data = 0;
			if(isEmpty()) {
				System.out.println("The stack is empty!!!");
			}
			else{
				top--;
				data=stack[top];
				stack[top]=0;
				shrink();
				
			}return data;
		}
		
		private void shrink() {
			int length = size();
			if(length<=(capacity/2)/2)
				capacity=capacity/2;
			
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length); 
            stack = newStack;
			
			
		}

		//peek is for showing data of the latest value inserted at stack
		
		public int peek() {
			int data;
			data = stack[top-1];
			return data;
		}
		
		//showing the size of stack
		public int size() {
			
			return top;
		}
		
		//show the stack is empty or not
		public boolean isEmpty() {
			
			return top<=0;
		}
		
		public void show() {
			
			for(int n : stack) {
				
				System.out.print(n+" ");
			}
			System.out.println("\n");
		}

}



