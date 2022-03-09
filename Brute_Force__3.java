package everyday_Study;

import java.util.*;
import java.io.*;

class Man {
	int weight;
	int height;
	int number;

	public Man(int w, int h) {
		weight = w;
		height = h;
		number = 0;
	}
}

class Brute_Force__3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Man> list = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int weight = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			list.add(new Man(weight, height));
		}

		getNumber(list);

		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i).number + " ");
		}
		bw.flush();
		
	}

	public static void getNumber(List<Man> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (i == j) continue;
				if (list.get(i).height < list.get(j).height && list.get(i).weight < list.get(j).weight) {
					count++;
				}
			}
			list.get(i).number = count + 1;
		}
	}
}

