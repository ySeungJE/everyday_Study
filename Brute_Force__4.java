package everyday_Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Brute_Force__4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 1, i = 666;
		
		while (count != num) {
			if (String.valueOf(++i).contains("666")) count++;
		}
		System.out.print(i);
	}
}
