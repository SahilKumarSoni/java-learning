import java.util.Scanner;

public class BruteForcePrimeNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int start,end;
		start = sc.nextInt();
		end = sc.nextInt();
		int i,j,sum=0,temp;
		boolean flag = false;
		for(i=start;i<=end;i++){
			flag = true;
			if(i<0){
				temp = -(i);
			}
			else{
				temp = i;
			}
			for (j=2;j<temp;j++){
				if(temp % j == 0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println("\n"+sum);
		
	}
}