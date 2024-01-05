import java.util.HashSet;
import java.util.Set;

public class ElementsSubarrays {
   
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> S=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%p==0){
                    count++;
                }
                if(count>k){
                    break;
                }
                sb.append(nums[j]+"_");
                S.add(sb.toString());
            }
        }
        return S.size();
    }
}

