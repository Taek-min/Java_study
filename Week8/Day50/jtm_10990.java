import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*"); //이건 띄어줬으면..
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(" ");
//지워주세요!
			}
			if (i > 0)
				System.out.print("*");
//지워주세요!
			System.out.println("");
		}
	}
}
//// 굳굳  :2 :3 아 몰랑 줄바꿈 잘해주세요!!!:ㅋㅋㅋㅋㅋ굿