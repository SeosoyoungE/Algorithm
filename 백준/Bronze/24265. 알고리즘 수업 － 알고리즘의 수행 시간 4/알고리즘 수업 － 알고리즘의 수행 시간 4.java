import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n=Long.parseLong(scan.nextLine());
        long k=0;
        for(long i = n-1;i>0;i--) {
        	k+=i;
        }
       
        
        System.out.print(k+"\n2");
   }
}