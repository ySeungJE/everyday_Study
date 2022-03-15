package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Simple_Math2__3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num, lest;
		num = Integer.parseInt(br.readLine());
		if (num == 1)
			return;
		else {
			boolean[] b_arr = new boolean[num + 1];
			b_arr[0] = true;
			b_arr[1] = true;

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if(b_arr[i]==true) continue;
				for (int j = i * i; j <= num; j += i) {
					b_arr[j] = false;
				}
			}
			int i = 2;
			lest = num;
			while (lest != 0 && i <= num) {
				if (b_arr[i] == false) {
					if (lest % i == 0) {
						lest = lest / i;
						bw.write(i + "\n");
					} else
						i++;
				}
			}
			bw.flush();
		}
	}
}

