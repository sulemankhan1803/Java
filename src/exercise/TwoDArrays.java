package exercise;

public class TwoDArrays {

	public static void main(String[] args) {
		int[][] flat = new int[2][3];
		flat[0][0] = 101;
		flat[0][1] = 102;
		flat[0][2] = 103;
		
		flat[1][0]= 201;
		flat[1][1]= 202;
		flat[1][2]= 203;
		
		for(int i = 0;i<flat.length;i++) {
			for(int j = 0;j<flat[i].length;j++) {
				System.out.print(flat[i][j]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		
		
		System.out.println("3rows and 3 columns");
		int[][] floor = new int [3][3];
		floor[0][0] = 101;
		floor[0][1] = 102;
		floor[0][2] = 103;
		
		floor[1][0] = 201;
		floor[1][1] = 202;
		floor[1][2] = 203;
		
		floor[2][0] = 301;
		floor[2][1] = 302;
		floor[2][2] = 303;
		
		for(int i = 0;i<floor.length;i++) {
			for(int j = 0;j<floor[i].length;j++) {
				System.out.print(floor[i][j]);
				System.out.print(" ");
				
			}
			System.out.println("");
		}


	}

}
