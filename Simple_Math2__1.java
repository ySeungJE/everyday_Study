package everyday_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Simple_Math2__1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop,n,count,answer=0;
		loop = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<loop; i++) {
			count=0;
			n = Integer.parseInt(st.nextToken());
			for(int j=2; j<=n; j++) {
				if(n%j==0) count++;
			}
			if(count==1) answer++;
		}
		System.out.print(answer);
	}
}
