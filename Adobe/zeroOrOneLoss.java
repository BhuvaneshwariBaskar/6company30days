
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zeroOrOneLoss {

    public List<List<Integer>> findWinners(int[][] matches) {
        
        Set<Integer> zero=new HashSet<>();
        Set<Integer> one =new HashSet<>();
        Set<Integer> more=new HashSet<>();
        
        for(int[] match:matches){
            int win=match[0];
            int loss=match[1];
            
            if(!one.contains(win) && !more.contains(win)){
                zero.add(win);
            }
            
            if(zero.contains(loss)){
                zero.remove(loss);
                one.add(loss);
            }
            else if(one.contains(loss)){
                one.remove(loss);
                more.add(loss);
            }else if(more.contains(loss)){
                continue;
            }else{
                one.add(loss);
            }
            
            
        }
     List<Integer> list1 = new ArrayList<>(zero);
        List<Integer> list2 = new ArrayList<>(one);
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        List<List<Integer>> answerList = new ArrayList<>();
        answerList.add(list1);
        answerList.add(list2);
        
        return answerList;

    }
}

