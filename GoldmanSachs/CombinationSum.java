import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public void tryCombo(List<Integer> temp,int n,int k,int start){
        if(temp.size()==k){
            if(n==0){
                result.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        for(int i=start;i<=9;++i){
            temp.add(i);
            tryCombo(temp,n-i,k,i+1);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        if(k>n){
            return result;
        }
        List<Integer> temp=new ArrayList<>();
        tryCombo(temp,n,k,1);
        return result;
    }
}
}
