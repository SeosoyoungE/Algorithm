import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long T = scan.nextLong();
		for (int i = 0; i < T; i++) {
			long C = scan.nextLong();
			String result = "";
			result += (C / 25) + " ";
			C %= 25;
			result += (C / 10) + " ";
			C %= 10;
			result += C / 5 + " ";
			C %= 5;
			result += C / 1 + "";
			C %= 1;
			System.out.println(result);
		}

	}
}