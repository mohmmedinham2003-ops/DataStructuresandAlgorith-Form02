import java.util.*;
class Node(){
		int data;
		Node next;
		Node(int data){
		this.data = data;	
		}
	
}
class Stack{
		private Node top;
		
		public void push(int data){
			Node n1 = new Node(data);
			n1.next = top;
			top = n1;
		}
	public void pop(){
			if(top!=null){
			top = top.next;	
				
			}	
		}
		
		public void printStack(){
				System.out.print("[");
				Node temp = top;
				while(temp!=null){
					System.out.print(temp.data+",");
					temp = temp.next;
				}
				System.out.println(isEmpty()?"empty]":"\b\b]");
				
		}






	
	
}









class Demo(){
		public static void main(String args[]){
			
			
			}
	
	
}
