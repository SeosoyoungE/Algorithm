import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue=new LinkedList<>();
		
		int num=Integer.parseInt(br.readLine());
		for(int i=1;i<=num;i++) {
			queue.add(i);
		}
		while(num!=1) {
			queue.remove();
			queue.add(queue.remove());
			num--;
		}
		System.out.println(queue.peek());
	}

}