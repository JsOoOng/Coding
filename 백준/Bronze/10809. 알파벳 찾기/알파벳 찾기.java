import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] alpa = new int[26];
		String S = scanner.nextLine();
		char[] ss = new char[100];
		
		
		for (int z = 0; z < 26; z++) {
			alpa[z] = -1;
		}
		
		for (int i = 0; i < S.length() && i < ss.length; i++) {
            ss[i] = S.charAt(i);
        }
		
		for (int j = 0; j < ss.length; j++) {
			char cha = ss[j];
			if (cha >= 'a' && cha <= 'z') {
                int index = cha - 'a';
                if (alpa[index] == -1) { // 첫 등장일 때만 저장
                    alpa[index] = j;
                }
            }
		}
		
		for (int z = 0; z < 26; z++) {
			System.out.print(alpa[z] + " ");
		}
	}
}