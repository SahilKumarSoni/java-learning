import java.util.Scanner;

class Node{
	public int data;
	public Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class SLinkedListExp{
	public Node head;
	public SLinkedListExp(){
		head=null;
	}
	public void insertAtStart(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		} else {
			newNode.next=head;
			head=newNode;
		}
		System.out.println("Node Inserted!!");
	}
	public void insertAtEnd(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		} else {
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
		System.out.println("Node Inserted!!");
	}
	public void insertAtMiddle(int data,int search){
		boolean flag=false;
		Node temp=head;
		while(temp!=null){
			if(temp.data==search){
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(!flag){
			System.out.println("Data Not Found!!");
		} else {
			Node newNode=new Node(data);
			Node nextNode=temp.next;
			temp.next=newNode;
			newNode.next=nextNode;
			System.out.println("Node Inserted!!");
		}
	}
	public void show(){
		if(head==null){
			System.out.println("Linked List is Empty!!");
		} else {
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	public void deleteAtStart(){
		if(head==null){
			System.out.println("No node is present to delete!!");
		} else {
			head=head.next;
		}
		System.out.println("Node Deleted!!");
	}
	public void deleteAtEnd(){
		if(head==null){
			System.out.println("No node is present to delete!!");
		} else {
			Node temp=head;
			Node previous=null;
			while(temp.next!=null){
				previous=temp;
				temp=temp.next;
			}
			previous.next=null;
			System.out.println("Node Deleted!!");
		}
	}
	public void deleteAtMiddle(int search){
		boolean flag=false;
		Node temp=head;
		Node previous=null,nextNode=null;
		while(temp!=null){
			if(temp.data==search){
				flag=true;
				break;
			}
			previous=temp;
			temp=temp.next;
		}
		if(!flag){
			System.out.println("Data Not Found!!");
		} else {
			nextNode=temp.next;
			previous.next=nextNode;
			System.out.println("Node Deleted!!");
		}
	}
	public static void main(String []args){
		SLinkedListExp obj=new SLinkedListExp();
		Scanner sc=new Scanner(System.in);
		int ch,data,search;
		while(true){
			System.out.println("1. INSERT AT START");
			System.out.println("2. INSERT AT END");
			System.out.println("3. INSERT AT MIDDLE");
			System.out.println("4. SHOW");
			System.out.println("5. DELETE AT START");
			System.out.println("6. DELETE AT END");
			System.out.println("7. DELETE AT MIDDLE");
			System.out.println("0. EXIT");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			if(ch==1){
				System.out.println("Enter the Data:");
				data=sc.nextInt();
				obj.insertAtStart(data);
			} else if(ch==2){
				System.out.println("Enter the Data:");
				data=sc.nextInt();
				obj.insertAtEnd(data);
			} else if(ch==3){
				System.out.println("Enter the Data:");
				data=sc.nextInt();
				System.out.println("Enter searchable data:");
				search=sc.nextInt();
				obj.insertAtMiddle(data,search);
			} else if(ch==4){
				obj.show();
			} else if(ch==0){
				break;
			} else if(ch==5){
				obj.deleteAtStart();
			} else if(ch==6){
				obj.deleteAtEnd();
			} else if(ch==7){
				System.out.println("Enter searchable data:");
				search=sc.nextInt();
				obj.deleteAtMiddle(search);
			}
		}
	}
}