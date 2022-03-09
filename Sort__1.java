package everyday_Study;


import java.util.*;
import java.io.*;

class Sort_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr); // 이거보다 collections.sort가 더 빠름, list 사용 추천
		for (int i : arr) {
			bw.write(i+"\n");
		}
		bw.flush();
	}
}
