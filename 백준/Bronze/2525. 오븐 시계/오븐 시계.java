import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int m = sc.nextInt();
		int h = H * 60 + M + m;
		int sum = h / 60;
		int min = h % 60;
		while (sum >= 24) {
			sum -= 24;
		}
		System.out.printf(sum +" "+ min);

    }
}