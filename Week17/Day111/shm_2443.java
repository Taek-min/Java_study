import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j < i; j++) {
				System.out.printf(" ");
			}
			for(int j = 2 * N - (2 * i - 1); j > 0; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
