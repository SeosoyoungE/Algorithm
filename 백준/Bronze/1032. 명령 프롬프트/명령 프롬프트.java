import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String[] str= new String[N];
		for(int i=0;i<N;i++) {
			str[i]=scan.next();
		}

		String ans=str[0];
		for (int i = 1; i < str.length; i++) {
			for (int j = 0; j < ans.length(); j++) {
				if(ans.charAt(j)!=str[i].charAt(j)) {
					ans=ans.substring(0, j)+'?'+ans.substring(j+1);
				}
			}
		}
		System.out.println(ans);
	}
	
}