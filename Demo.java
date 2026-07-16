//Stack Linked
/*import java.util.*;
class Node{
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
					System.out.print(temp.data+", ");
					temp = temp.next;
				}
			System.out.println(isEmpty() ?"empty]":"\b\b]");
				
		}
		
		public int size(){
			Node temp = top;
			int count = 0;
			while(temp!=null){
				count++;
				temp = temp.next;
				
			}	
			return count;
			
		}
		
		public boolean isEmpty(){
				return top == null;
		}
		
		public void clear(){
			top = null;
		}
		
		public int search(int data){
				Node temp = top;
				int index = 0;
				while(temp!=null){
					if(temp.data == data){
					return index;	
					}
					index++;
					temp = temp.next;
					
				}
				return -1;
			
			
		}
		
		public int[] toArray(){
		int[] tempDataArray = new int[size()];
		Node temp = top;
		for(int i =0;i<tempDataArray.length;i++){
			tempDataArray[i] = temp.data;
			temp = temp.next;
			
		}
		return tempDataArray;	
			
		}
	
}

class Demo{
		public static void main(String args[]){
			Stack s1 = new Stack();
			s1.push(100);
			s1.push(200);
			s1.push(300);
			s1.push(400);
			s1.push(500);
			s1.printStack();
				
			int[] dataArray = s1.toArray();
			System.out.println(Arrays.toString(dataArray));
	
		}
}*/

//Queue Linked

/*import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){this.data = data;}
	
}

class Queue{
	private Node front;
	public void add(int data){
		Node n1 = new Node(data);
			if(isEmpty()){
			front =n1;	
			}else{
			Node lastNode = front;
			while(lastNode.next!=null){
				lastNode = lastNode.next;
			}
			lastNode.next = n1;	
		}
		
		
	}
	
	public void remove(){
		if(front!=null){
		front = front.next;	
		}	
		
	}
	
	public void printQueue(){
		System.out.print("[");
		Node temp = front;
		while(temp!=null){
		System.out.print(temp.data+", ");
		temp = temp.next;	
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
		
	}
	
	public int size(){
			Node temp = front;
			int count = 0;
			while(temp!=null){
				count++;
				temp = temp.next;
			}
			return count;
		
	}
	
	public boolean isEmpty(){
			return front == null;
		
	}
	
	public void clear(){
			front = null;
	}
	public  int search(int data){
		Node temp = front;
		int index = 0;
		while(temp!=null){
			if(temp.data == data){
			return index;	
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}
	public int[] toArray(){
		int[] tempDataArray = new int[size()];
		Node temp = front;
		for(int i =0;i<tempDataArray.length;i++){
				tempDataArray[i] = temp.data;
				temp = temp.next;
		}
		return tempDataArray;
		
	}
	
}


class Demo{
	public static void main(String args[]){
		Queue q1 = new Queue();
		q1.add(100);
		q1.add(200);
		q1.add(300);
		q1.add(400);
		q1.add(500);
		q1.printQueue();
		
		q1.remove();
		q1.printQueue();
		
		
	}	
	
}
*/

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class List{
	private Node first;

	public void add(int data){ //Insertion order
		addLast(data); //add(size(),data)
	}
	public void add(int index, int data){
		if(index>=0 && index<=size()){
			Node n1=new Node(data);
			if(index==0){
				n1.next=first;
				first=n1;
			}else{
				int count=0;
				Node temp=first;
				while(count<index-1){
					count++;
					temp=temp.next;
				}
				n1.next=temp.next;
				temp.next=n1;
			}
		}
	}
	public void addLast(int data){
		add(size(),data);
	}
	public void addFirst(int data){
		add(0,data);		
	}
	public void removeLast(){
		remove(size()-1);
	}
	public void removeFirst(){
		remove(0);
	}
	public void remove(int index){
		if(!isEmpty() && index>=0 && index<size()){
			if(index==0){
				first=first.next;
			}else{
				int count=0;
				Node temp=first;
				while(count<index-1){
					count++;
					temp=temp.next;
				}
				temp.next=temp.next.next;
			}
		}
	}
	public int get(int index){
		if(index>=0 && index<size()){
			int count=0;
			Node temp=first;
			while(count<index-1){
				count++;
				temp=temp.next;
			}
			return temp.data;
		}
		return -1;
	}
	public void printList(){
		System.out.print("[");
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
	}
	public int size(){
		Node temp=first;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public void clear(){
		first=null;
	}
	public int search(int data){
		Node temp=first;
		int index=0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public int[] toArray(){
		int[] tempDataArray=new int[size()];
		Node temp=first;
		for (int i = 0; i < tempDataArray.length; i++)	{
			tempDataArray[i]=temp.data;
			temp=temp.next;
		}
		return tempDataArray;
	}
}
class Demo{
	public static void main(String args[]){
		List intList=new List();
		intList.add(100);
		intList.add(200);
		intList.add(300);
		intList.add(400);
		intList.add(500);
		intList.add(600);
		intList.printList(); //[100,200,300,400,500,600]
		for (int i = 0; i < intList.size(); i++){
			int data=intList.get(i);
			System.out.println(data);
		}
		
	}
}
