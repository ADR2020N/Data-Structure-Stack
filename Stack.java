package StackImplentation;

import java.util.Scanner;

public class Stack {
		static Scanner sc = new Scanner(System.in);
	    static int stack[],top=-1,size;;//pointer is not pointing anywhere in the stack;
	    
	    static {
	    	Stack.create();
	    }
	    
	    
		public static void main(String[]args) {
		   int ch,item;
		   while(true) {
			   System.out.println("1.Push");
			   System.out.println("2.Pop");
			   System.out.println("3.Peek");
			   System.out.println("4.Traverse");
			   System.out.println("5.Quit");
			   
	        System.out.println("Enter your Choice: ");
	       ch=Stack.sc.nextInt();
	    switch (ch) {
		case 1: System.out.println("Enter Element: ");
		      item=sc.nextInt();
		      Stack.push(item);
		        break;
		case 2: item=Stack.pop();
		   if(item==0){
			System.out.println("Stack is UnderFlow");
		   }else {
			   System.out.println("Poped Item is: "+item);
		   }
		   break;
		    case 3:item=Stack.peek();
		   if(item==0){
			   System.out.println("Stack is UnderFlow");
		   }else {
			   System.out.println("Peek Item is: "+item);
		   }
		   break;
		case 4: Stack.traverse();
		        break;
		case 5: System.exit(1);
			     break;
		
		default:
			 System.out.println("Invalid Choice");
		}
		   }
	   }
		
		static void create() {
			System.out.println("Enter Size of Stack: ");
			size=Stack.sc.nextInt();
		    Stack.stack=new int[size];
		    System.out.println("Stack Created with the size: "+size);
		}
		static void push(int item) {
			if(Stack.isfull()) {
				System.out.println("Stack is OverFlow \n");
			}else {
				stack[++top]=item;
			}
		}
		static boolean isfull() {
			if(top==size-1) {
				return true;
			}else {
				return false;
		}
	}
		static int pop() {
			if(Stack.isEmpty()) {
				return 0;
			}else {
				return stack[top--];
			}
		}
		static boolean isEmpty() {
			if(top==-1) {
				return true;
			}else {
				return false;
			}
		}
		static int peek() {
			if(Stack.isEmpty()) {
				return 0;
			}else {
				return stack[top];
			}
		}
		static void traverse() {
			if(isEmpty()) {
				System.out.println("Stack is Empty!!!!");
			}else {
				System.out.println("Elemet of Stack are: ");
				 for (int i=top;i>=0;i--) {
			            System.out.println(stack[i]);
			        }
			}
		}
		
	}


