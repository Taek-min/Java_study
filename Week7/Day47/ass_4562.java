import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		int xBrains[] = new int[line];
		int yBrains[] = new int[line];
		
		for(int i =0 ; i < line ; i++){
		    xBrains[i] = scan.nextInt();
		    yBrains[i] = scan.nextInt();
		}
		for(int k =0 ; k < line ; k++){
		    if(xBrains[k]<yBrains[k]){
		        System.out.println("NO BRAINS");
		    }else if(xBrains[k]>=yBrains[k]){
		        System.out.println("MMM BRAINS");
		    }
		}
	}
}