package exercise;

public class Arrays {
	public static void main(String[] args) {
		int marks[] = new int[5];
		marks[0] = 98;
		marks[1] = 88;
		marks[2] = 78;
		marks[3] = 68;
		marks[4] = 58;
		System.out.println(marks[0]);
		
		String[] names;
		names = new String[2];
		names[0]="Harry";
		names[1]="Max";
		System.out.println(names[1]);
		
		float[] nums = new float[2];
		nums[0] = 1.0f;
		nums[1] = 5.0f;
		System.out.println(nums[0]);
		
		int[] grade = {98,76,82,87,66,89};
		System.out.println(grade.length);
		
		for(int i=0;i<grade.length;i++) {
			System.out.println(grade[i]);
		}
		System.out.println("Printing in reverse order");
		for(int i=grade.length-1;i>=0;i--) {
			System.out.println(grade[i]);
		}
		System.out.println("for-each loop");
//		Using for-each
		for(int element:grade) {
			System.out.println(element);
			
		}
		
		
	}

}
