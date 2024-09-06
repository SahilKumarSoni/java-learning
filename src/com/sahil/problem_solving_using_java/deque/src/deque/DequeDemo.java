package deque;

import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
//		Deque<Integer> dq1 = new ArrayDeque<>();
		Deque<Integer> dq = new LinkedList<>();
		
//-------------adding the elements-------------------
		//offer()
		dq.offer(110);
		dq.offer(120); //time complexity -> O(n), n is the elements before inserting in the deque
		dq.offerLast(130); //time complexity -> O(1), better than offer()
		dq.offerFirst(100); //time complexity -> O(1)
		//add()
		dq.add(1000);//time complexity -> O(n), n is the elements before inserting in the deque
		dq.addLast(1100);//time complexity -> O(1), better than add()
		dq.addFirst(50);
		System.out.println(dq);
		
//--------------removing the elements----------------------------
		//pop()
		System.out.println(dq.pop());
		System.out.println(dq);
		//poll()
		System.out.println(dq.poll());
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		System.out.println(dq.pollLast());
		System.out.println(dq);
				
//--------------accessing the elements--------------------
		//peek()
		System.out.println(dq.peek());
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq);
		//get()
		System.out.println(dq.getFirst());
		System.out.println(dq);
		System.out.println(dq.getLast());
		System.out.println(dq);
	}

}
