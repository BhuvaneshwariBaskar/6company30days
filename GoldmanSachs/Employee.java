import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

    public boolean isAccessHigh(List<Integer> time){ 
        int n = time.size();
        for (int i = 2; i < n; i++) {
            int curr = time.get(i);
            int prev_prev = time.get(i - 2);
            if (prev_prev + 99 >= curr) {
                return true;
            }
        }
        return false;
    }
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        int n=access_times.size();
        HashMap<String,List<Integer>> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(access_times.get(i).get(1));
            if(map.containsKey(access_times.get(i).get(0))){
                map.get(access_times.get(i).get(0)).add(num);
            }
            else{
                map.put(access_times.get(i).get(0),new ArrayList<>(Arrays.asList(num)));
            }
        }
        for(Map.Entry<String,List<Integer>> mp:map.entrySet()){
            List<Integer> arr=mp.getValue();
            Collections.sort(arr);
            if(isAccessHigh(arr)){
                res.add(mp.getKey());
            }
        } 
         return res;      
    }
}


