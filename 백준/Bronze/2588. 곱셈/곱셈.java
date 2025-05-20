import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int E = B;
		int C = B/100;
		B = B%100;
		int D = B/10;
		B = B%10;
		System.out.println(A*B);
		System.out.println(A*D);
		System.out.println(A*C);
		System.out.println(A*E);
	}
}