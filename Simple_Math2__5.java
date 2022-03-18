package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Simple_Math2__5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, count;
		while(true) {
		n = Integer.parseInt(br.readLine());
		if(n==0) break;
		count=0;
		boolean[] b_arr = new boolean[(n*2)+1];
		b_arr[0]=true; b_arr[1]=true;
		for(int i=2; i<=Math.sqrt(b_arr.length);i++) {
			if(b_arr[i]==true) continue;
			for(int j=i*i; j<b_arr.length; j+=i) {
				b_arr[j] = true;
			}
		}
		for(int i=n+1; i<b_arr.length; i++)
			if(b_arr[i]==false)
				count++;
		bw.write(count+"\n");
		}
		bw.flush();
	}
}
