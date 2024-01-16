import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class FreqWordK {
   
    class Pair{
        String s;
        int val;
        Pair(String s,int val){
            this.s=s;
            this.val=val;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->{
            if(p1.val==p2.val)return p1.s.compareTo(p2.s);
            else return p2.val-p1.val;
        });
        for(String s:mp.keySet())pq.add(new Pair(s,mp.get(s)));
        List<String> ans=new ArrayList<>();
        while(k-->0)ans.add(pq.poll().s);
        return ans;
    }
}

