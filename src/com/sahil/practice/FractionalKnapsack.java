import java.util.*;

public class FractionalKnapsack{
	Scanner sc=new Scanner(System.in);
	FractionalKnapsack(){
		System.out.print("Enter the no. of Objects:");
		int n=sc.nextInt();
		System.out.print("Enter the weight of bag:");
		int w=sc.nextInt();
		System.out.print("Enter the "+n+" values:");
		int []values=new int[n];
		for(int i=0;i<n;i++){
			values[i]=sc.nextInt();
		}
		System.out.print("Enter the "+n+" weights:");
		int []weight=new int[n];
		for(int i=0;i<n;i++){
			weight[i]=sc.nextInt();
		}
		int fraction[]=new int[n];
		for(int i=0;i<n;i++){
			fraction[i]=values[i]/weight[i];
		}
		for(int i=0;i<n;i++){
			System.out.println(fraction[i]);
		}
	}
	public static void main(String []args){
		new FractionalKnapsack();
	}
}