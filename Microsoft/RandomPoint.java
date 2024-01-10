import java.util.Random;
import java.util.TreeMap;

public class RandomPoint {

    private int[][] rects;
    private Random random;
    private TreeMap<Integer,Integer> map;
    private int sum;
    // public Solution(int[][] rects) {
    //     this.rects=rects;
    //     random=new Random();
    //     map=new TreeMap();
    //     sum=0;
    //     for(int i=0;i<rects.length;i++){
    //         int[] rect=rects[i];
    //         sum+=(rect[2]-rect[0]+1)*(rect[3]-rect[1]+1);
    //         map.put(sum,i);
    //     }
    // }
    
    public int[] pick() {
        int num=map.ceilingKey(random.nextInt(sum > 0 ? sum : 1)+1);
        int[] rec=rects[map.get(num)];
        return new int[]{rec[0]+random.nextInt(rec[2]-rec[0]+1),rec[1]+random.nextInt(rec[3]-rec[1]+1)};
    }
}

