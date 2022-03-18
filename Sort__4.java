package everyday_Study;

import java.io.*;
import java.util.*;

class Sort__4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> preq_list = new ArrayList<>();
        
        double aver = 0; 
        int preq_max = Integer.MIN_VALUE, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            aver+=num;
            if(num<min) min = num;
            if(num>max) max = num;
            list.add(num);
            
            if(map.containsKey(num)) 
                map.replace(num, map.get(num)+1);
            else 
                map.put(num, 1);
        }
        list.sort(null);
        
        for(Integer  i : map.keySet()) 
            if(map.get(i)>preq_max) preq_max = map.get(i);
        
         for(Integer  i : map.keySet()) 
            if(map.get(i)==preq_max) preq_list.add(i);
        
        preq_list.sort(null);
        
        bw.write(Math.round(aver/n)+"\n");
        bw.write(list.get(list.size()/2)+"\n");
        bw.write( ((preq_list.size()==1) ? preq_list.get(0) : preq_list.get(1))+"\n");
        bw.write((max-min)+" ");
        
        bw.flush();
    }
}
