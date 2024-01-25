import java.util.Arrays;
import java.util.HashSet;

public class CountWords {
 
    public int wordCount(String[] startWords, String[] targetWords) {
        HashSet<String> set=new HashSet<>();
        for(String t:startWords){
            char[] chararr=t.toCharArray();
            Arrays.sort(chararr);
            set.add(new String(chararr));
        }
        int count=0;
        for(String t:targetWords){
            int n=t.length();
            for(int i=0;i<n;i++){
                String c=t.substring(0,i)+t.substring(i+1);
                char[] chararr2=c.toCharArray();
                Arrays.sort(chararr2);
                if(set.contains(new String(chararr2))){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

