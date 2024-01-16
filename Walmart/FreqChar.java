import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FreqChar {
  
    public String frequencySort(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray())mp.put(c,mp.getOrDefault(c,0)+1);
        
        PriorityQueue<Character> pq=new PriorityQueue<>((x,y)->mp.get(y)-mp.get(x));
        for(char c:mp.keySet()){
            pq.offer(c);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            for(int i=0;i<mp.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

