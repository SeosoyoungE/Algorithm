import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b="";
        for (int i = a.length()-1; i >=0; i--) {
			b+=a.charAt(i);
		}
        if(b.equals(a)) {
        	System.out.println("1");
        }else {
        	System.out.println("0");
        }
   }
}