package Month2;

import java.util.Scanner;

public class shm_10103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int jeongSou = 100;
		int sangDeok = 100;
		
		for(int i = 0; i < loop; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			
			if(firstNum > secondNum) {
				sangDeok -= firstNum;
			}
			else if(firstNum < secondNum) {
				jeongSou -= secondNum;
			}
			else {
				continue;
			}
		}
		System.out.println(jeongSou);
		System.out.println(sangDeok);
	}
}