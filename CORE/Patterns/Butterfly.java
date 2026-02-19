// package CORE.Patterns;
import java.util.Scanner;


public class Butterfly {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int j = 1;j<=n;j++) {
			for(int i=0;i<=n/2+1;i++) {
				if(j+i>=n/2+2 && j-i<=n/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}

