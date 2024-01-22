
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class minimumEncoding {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,Comparator.comparingInt(String::length).reversed());
        
        List<String> encoding=new ArrayList<>();
        
        encoding.add(words[0]);
        int n=words[0].length();
        for(int i=1;i<words.length;i++){
            boolean suffix=false;
            for(String w:encoding){
                if(w.endsWith(words[i])){
                    suffix=true;
                    break;
                }
            }
            if(!suffix){
                encoding.add(words[i]);
                n+=words[i].length();
            }
        }
        return n+encoding.size();
    }
}
