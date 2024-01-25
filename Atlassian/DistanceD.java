
import java.util.Arrays;

public class DistanceD {
  
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // int count=0;
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(Math.abs(arr1[i]-arr2[j])<=d){
        //             count++;break;
        //         }
        //     }
        // }
        // return arr1.length-count;
        int count=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
                    int left=0;int right=arr2.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(Math.abs(arr1[i]-arr2[mid])<=d){
                    count++;break;
                }
                else if(arr1[i]<arr2[mid])right=mid-1;
                else left=mid+1;
            }
        }
        return arr1.length-count;
    }
}

