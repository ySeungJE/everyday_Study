package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Simple_Math2__6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num, loop, min, answer=0;
		loop = Integer.parseInt(br.readLine());
		List<Integer> list;
		for (int l = 0; l < loop; l++) {
			list = new ArrayList<>();
			min = Integer.MAX_VALUE;
			num = Integer.parseInt(br.readLine());
			boolean[] b_arr = new boolean[num + 1];
			b_arr[0] = true;
			b_arr[1] = true;
			for (int i = 2; i <= Math.sqrt(b_arr.length); i++) {
				if (b_arr[i])
					continue;
				for (int j = i * i; j < b_arr.length; j += i) {
					b_arr[j] = true;
				}
			}
			for (int i = 2; i < b_arr.length; i++) {
				if (b_arr[i] == false)
					list.add(i);
			}
			for (Integer i : list) {
				if (list.contains(num - i)&&(((num-i) - i)<min)&&((num-i) - i)>=0) {
						min = (num-i) - i;
						answer = i;
				}
			}
			bw.write(answer + " " + (num - answer)+"\n");
		}
		bw.flush();
	}
}