import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		
		for(int i = 0; i < loop; i++) {
			int num = sc.nextInt();
			for(int j = 0; j < num; j++) {
				System.out.printf("=");
			}
			System.out.println();
		}
	}
}
