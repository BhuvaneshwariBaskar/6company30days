public class Winner {

        public int findTheWinner(int n, int k) {
            return result(n,k-1)+1;
        }
       private int result(int n,int k){
            if(n==0)return 0;
            return ((k+1)%n+result(n-1,k))%n;
        }
    }
    
// class Solution {
//     public int findTheWinner(int n, int k) {
//         LinkedList<Integer> participants=new LinkedList<>();
//         for(int i=1;i<=n;i++){
//             participants.add(i);
//         }
//         int lastkilled=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<k-1;j++){
//                 participants.add(participants.poll());
//             }
//             lastkilled=participants.poll();
//         }
//         return lastkilled;
//     }
// }