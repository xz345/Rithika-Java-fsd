package practice_project9;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> qq=new LinkedList<>();
		
		qq.offer(12);
		qq.offer(24);
		qq.add(03);
		qq.add(10);
		
		System.out.println("After Insertion Queue");
		System.out.println(qq);
		
		while (!qq.isEmpty()) {
            int dq = qq.poll();
            System.out.println("Dequeued: " + dq);
        }

		System.out.println("Queue elements after removal:");
        System.out.println(qq);
	}

}
