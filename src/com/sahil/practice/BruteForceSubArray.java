import java.util.*;

public class BruteForceSubArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String inputData[] = sc.nextLine().split(" ");
		int i,j,sum=0;
		for(i=0;i<inputData.length;i++){
			list.add(Integer.parseInt(inputData[i]));
		}
		for(i=0;i<list.size()-1;i++){
			sum=0;
			for(j=i;j<list.size();j++){
				if(list.get(j)%2!=0){
					sum+=list.get(j);
				}
				System.out.print(list.get(j)+" ");
			}
			System.out.println("=>"+sum);
		}
	}
}