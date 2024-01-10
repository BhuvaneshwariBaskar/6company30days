import java.util.Arrays;

public class MedianStep {
 
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int step=0;
        for(int num:nums){
            step+=Math.abs(num-mid);
        }
        return step;
        
    }
}

