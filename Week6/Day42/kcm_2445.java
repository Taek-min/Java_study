import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int line = in.nextInt();
		String stars = "";
		for(int i = 0; i < line; i++) {
			stars = "";
			for(int j = 0; j <= i; j++) {
				stars += "*";
			}
			for(int k = i+1; k < line*2 ; k++) {
				if(k >= line*2 - (i + 1)) {
					stars += "*";
				}
				else {
					stars += " ";
				}
			}
			System.out.println(stars);
		}
		for(int l = 0; l < line-1; l++) {
			stars = "";
			for(int z = 1; z < line -l; z++) {
				stars += "*";
			}
			for(int t = line- l; t <= line*2; t++) {
				if(t > line + l +1) {
					stars += "*";
				}
				else {
					stars += " ";
				}
			}
			System.out.println(stars);
		}
	}
}