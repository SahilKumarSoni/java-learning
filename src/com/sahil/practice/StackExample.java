import java.util.Scanner;

class StackOp{
	int arr[]=new int[100];
	int size,top;
	StackOp(){
		top=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		size=sc.nextInt();
	}
	public void push(int val){
		if(top==size-1){
			System.out.println("Stack Overflow!");
		} else {
			top++;
			arr[top]=val;
			System.out.println("Element Pushed!");
		}
	}
	public int pop(){
		if(isEmpty()){
			return -404;
		} else {
			int temp=arr[top];
			top--;
			return temp;
		}
	}
	public boolean isEmpty(){
		if(top==-1) return true;
		else return false;
	}
	public int peak(){
		return (this.arr[this.top]);
	}
	public void show(){
		if(isEmpty()){
			System.out.println("Stack Empty!");
		} else {
			System.out.println("Stack:");
			for(int i=0;i<=top;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
public class StackExample{
	public static void main(String []args){
		StackOp obj=new StackOp();
		Scanner sc= new Scanner(System.in);
		while(true){
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. Check EMPTY");
			System.out.println("4. Peak Element");
			System.out.println("5. SHOW");
			System.out.println("0. Exit");
			int ch=sc.nextInt();
			if(ch==1){
				int val=sc.nextInt();
				System.out.println("Enter the element you want to enter:");
				obj.push(val);
			} else if(ch==2){
				int temp=obj.pop();
				if(temp==-404){
					System.out.println("Stack Underflow!");
				} else {
					System.out.println("Element Poped:"+temp);
				}
			} else if(ch==3){
				System.out.println("Stack empty:"+obj.isEmpty());
			} else if(ch==4){
				System.out.println("Peak Element:"+obj.peak());
			} else if(ch==5){
				obj.show();
			} else if(ch==0){
				break;
			}
		}	
	}
}