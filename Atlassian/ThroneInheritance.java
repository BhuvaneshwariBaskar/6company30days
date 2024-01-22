package Atlassian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class ThroneInheritance {
    Map<String,ArrayList<String>> map;
    HashSet<String> death;
    String kingName;
    public ThroneInheritance(String kingName) {
        map=new HashMap<>();
        death=new HashSet<>();
        this.kingName=kingName;
    }
    
    public void birth(String parentName, String childName) {
        map.computeIfAbsent(parentName,key->new ArrayList<>()).add(childName);
    }
    
    public void death(String name) {
        death.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        ArrayList<String> result=new ArrayList<>();
        Stack<String> s=new Stack<>();
        s.add(kingName);
        while(s.size()>0){
            String str=s.pop();
            if(!death.contains(str))result.add(str);
            if(map.containsKey(str)){
                ArrayList<String> list=map.get(str);
                for(int i=list.size()-1;i>=0;i--){
                    s.add(list.get(i));
                }
            }
        }
        return result;
        
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */

