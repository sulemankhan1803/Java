package exercise;

public class HalfDaimond {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for (int i = 10; i >= 1; i--) {

			for (int j = i; j <= 10; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}

