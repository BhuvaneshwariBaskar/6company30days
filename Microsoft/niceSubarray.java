public class niceSubarray {

        public int numberOfSubarrays(int[] nums, int k) {
            return atMost(nums,k)-atMost(nums,k-1);
        }
        public int atMost(int[] nums,int k){
            int count=0;
            int start=0;
            int ans=0;
            for(int end=0;end<nums.length;end++){
                if(nums[end]%2!=0)count++;
                while(start<=end && count>k){
                    if(nums[start++]%2!=0)count--;
                }
                ans+=end-start+1;
            }
            return ans;
            
        }
    }

