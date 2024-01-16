import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindPair {
   
    public int findPairs(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(Arrays.binarySearch(nums,i+1,n,nums[i]+k)>0){
                s.add(Math.min(nums[i],nums[i]+k));
            }
        }
        return s.size();
    }
}

