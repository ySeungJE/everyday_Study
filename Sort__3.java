package everyday_Study;


import java.io.*;
class Sort__3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[10001]; // �ߺ��� ���� ���ؼ��� int�迭�� �̿��Ͽ� counting ����
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        
        for(int i=0; i<arr.length; i++) 
            if(arr[i]!=0) 
                for(int j=0; j<arr[i]; j++) 
                    bw.write(i+"\n"); // ���⼭ BufferedWriter ���ٵ� StringBuilder �� ����ϴ� ���� �� ��������, �������⵵�� �ſ� ����
        bw.flush();
    }
}
