import java.util.Arrays;

public class SquareFree {

    int MOD=(int)1e9+7;
    public int squareFreeSubsets(int[] nums) {
        int n=nums.length;
        
        int[][] dp=new int[1010][1<<11];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        
        int[] prime=new int[]{2,3,5,7,11,13,17,19,23,29};
        
        int[] numMask=new int[n];
        for(int i=0;i<n;i++){
            numMask[i]=numMaskfunc(nums[i],prime);
        }
       return (dfs(0, 1, numMask, dp) - 1 + MOD) % MOD;
    }
        public int dfs(int pos,int productMask,int[] numMask,int[][] dp){
        if(pos>=numMask.length)return 1;
        if(dp[pos][productMask]!=-1)return dp[pos][productMask];
        
        int ans=dfs(pos+1,productMask,numMask,dp);
        
        if((productMask & numMask[pos])==0){
            ans=(ans+dfs(pos+1,(productMask|numMask[pos]),numMask,dp))%MOD;
        }
        return dp[pos][productMask]=ans;
    }
    public int numMaskfunc(int num,int[] prime){
        int mask=0;
        for(int i=0;i<prime.length;i++){
            int p=prime[i];
            int cnt=0;
            while(num%p==0){
                num/=p;
                cnt++;
            }
            if(cnt==0)continue;
            if(cnt==1) mask|=(1<<(i+1));
            if(cnt>=2)return -1;
        }
        return mask;
    }

}

