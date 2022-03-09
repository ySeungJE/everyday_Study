package everyday_Study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Sort__2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        boolean[] check = new boolean[2000001]; // counting 알고리즘을 사용, 시간복잡도가 매우매우 낮아서 속도 빠름, but 공간복잡도 증가
        
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			check[Integer.parseInt(br.readLine())+1000000] = true;
		}
		for(int i=0; i<check.length; i++) {
            if(check[i]) bw.write((i-1000000)+"\n");
        }
		bw.flush();
	}
}
