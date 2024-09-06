import java.util.*;

public class FindMaxMin{

	static void max(ArrayList<Integer> list){
		int max1=list.get(0),max2=list.get(0),max3=list.get(0);
		for(int i=0;i<list.size();i++){
			if(max1<list.get(i)){
				max1 = list.get(i);
			}
		}
		for(int i=0;i<list.size();i++){
			if(max2<list.get(i) && max2!=max1){
				max2 = list.get(i);
			}
		}
		for(int i=0;i<list.size();i++){
			if(max3<list.get(i) && (max3!=max1 && max3!=max2)){
				max3 = list.get(i);
			}
		}
	}
	static void min(ArrayList<Integer> list){
		
	}

	public static void main(String []args){
		Scanner sc = new Scanner;
		ArrayList<integer> list = new ArrayList<Integer>();
		String inputData = sc.nextLine().split(" ");
		for(i=0;i<inputData.length;i++){
			list.add(Integer.parseInt(inputData[i]));
		}
		max(list);
		min(list);
	}
}