import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=scan.nextLong();
       
        
        for (int i = 0; i < n; i++) {
        	 long a=scan.nextLong();
             long b=scan.nextLong();
             long result=1;
             for (int j = 1; j <= b; j++)
             {
                 result = result * a % 10;
             }
             if(result==0) {
            	 result=10;
             }
             System.out.println(result);
		}
       
        
       
   }
}