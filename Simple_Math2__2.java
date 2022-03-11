package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Simple_Math2__2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int from = Integer.parseInt(br.readLine());
		int to = Integer.parseInt(br.readLine());
		boolean[] b_arr = new boolean[to + 1];
		int min = Integer.MAX_VALUE, sum = 0;
		b_arr[0] = true;
		b_arr[1] = true;
		for (int i = 2; i <= Math.sqrt(b_arr.length); i++) { // 닥치고 에라토스테네스의 체 쓰자 쥐랄하지말고
			if(b_arr[i]==true) continue;
			for (int j = i * i; j < b_arr.length; j += i) {
				b_arr[j] = true;
			}
		}
		for (int i = from; i < b_arr.length; i++) {
			if (b_arr[i] == false) {
				sum += i;
				if (i < min)
					min = i;
			}
		}
		if(sum==0)
			bw.write(-1+"");
		else {
			bw.write(sum + "\n");
			bw.write(min + "");
		}
		bw.flush();
	}
}
