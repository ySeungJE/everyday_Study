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
		Arrays.sort(arr); // �̰ź��� collections.sort�� �� ����, list ��� ��õ
		for (int i : arr) {
			bw.write(i+"\n");
		}
		bw.flush();
	}
}
