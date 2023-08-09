package exercise;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();

		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.addFirst(10);
		list.addLast(20);
		System.out.println(list);
		
		list.set(0, 110);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
	}
}
