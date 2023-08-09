package exercise;


import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		
		list.add(0,5);
		System.out.println(list);
		
		int element = list.get(0);
		System.out.println(element);
		
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		
		list.set(0, 6);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list2.add(14);
		
		System.out.println(list2);
		
		list.addAll(list2);
		
		System.out.println(list);
		
		System.out.println(list.contains(14));
		
		
		
		

		
	}

}
