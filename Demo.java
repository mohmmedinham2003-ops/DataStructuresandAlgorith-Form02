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
	
}









class Demo(){
		public static void main(String args[]){
			
			
			}
	
	
}
