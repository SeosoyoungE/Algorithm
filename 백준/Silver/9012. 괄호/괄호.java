import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);

		int num=Integer.parseInt(key.nextLine());
		String r="";
		while(num!=0) {
			String a=key.nextLine();
			Stack<String> stack=new Stack<>();
		for (int j = 0; j < a.length(); j++) {
			if(a.charAt(j)=='(') {
				stack.push("(");
			}
			else if(a.charAt(j)==')') {
				try {
					stack.pop();
				} catch (EmptyStackException e) {
					r="NO";
					stack.push("No");
					j=a.length();
				}
			}
		}
		if(stack.isEmpty()) {
			r="YES";
		} else if(!stack.isEmpty()) {
			r="NO";
		} System.out.println(r);
		num--;
		}
	}

}