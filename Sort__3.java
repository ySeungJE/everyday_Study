package everyday_Study;


import java.io.*;
class Sort__3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[10001]; // 중복을 세기 위해서는 int배열을 이용하여 counting 정렬
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        
        for(int i=0; i<arr.length; i++) 
            if(arr[i]!=0) 
                for(int j=0; j<arr[i]; j++) 
                    bw.write(i+"\n"); // 여기서 BufferedWriter 보다도 StringBuilder 를 사용하는 것이 더 빠르지만, 공간복잡도가 매우 증가
        bw.flush();
    }
}
