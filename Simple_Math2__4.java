package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Simple_Math2__4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		boolean[] b_arr = new boolean[n+1];
		b_arr[0]=true; b_arr[1]=true;
		for(int i=2; i<=Math.sqrt(b_arr.length);i++) {
			if(b_arr[i]==true) continue;
			for(int j=i*i; j<b_arr.length; j+=i) {
				b_arr[j] = true;
			}
		}
		for(int i=m; i<b_arr.length; i++)
			if(b_arr[i]==false)
				bw.write(i+"\n");
		bw.flush();
	}
}
