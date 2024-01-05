public class MissingRepeating {
    
    int[] findTwoElement(int arr[], int n) {
        // code here
      int[] frequency = new int[n + 1];
       int[] ans =new int[2];
       for (int num : arr) {
            frequency[num]++;
        }
        // System.out.println(map);
       
        for(int i=1;i<=n;i++){
          if(frequency[i]==0) {
            ans[1]=i;
            break;
          }
        }
        for(int i=1;i<=n;i++){
          if(frequency[i]==2) {
            ans[0]=i;
            break;
          }
        }
        return ans;
    }
}

