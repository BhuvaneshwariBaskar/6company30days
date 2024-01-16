public class Rotate {
    
        int maxval=0;
        public int maxRotateFunction(int[] nums) {
            int n=nums.length;
            if(n==1)return maxval; 
            
            int F=0;
            int S=0;
            for(int i=0;i<n;i++){
                F=F+(nums[i]*i);
                S=S+nums[i];
            }
            int max=F;
            for(int i=n-1;i>=0;i--){
                F=F+S-n*(nums[i]);
                max=Math.max(F,max);
            }
            return max;
        }
        
    }

