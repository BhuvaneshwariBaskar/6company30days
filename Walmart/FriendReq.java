public class FriendReq {
        public int numFriendRequests(int[] ages) {
            int[] freq=new int[121];
            for(int age:ages){
                freq[age]++;
            }
            int cnt=0;
            for(int i=15;i<=120;i++){
                for(int j=(int)(0.5*i+7)+1;j<=i;j++){
                   cnt+=freq[j]*(freq[i]-(i==j?1:0));
                }
            }
            return cnt;
        }
    }
