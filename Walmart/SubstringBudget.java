public class SubstringBudget {
        public int equalSubstring(String s, String t, int maxCost) {
            int j, i=0;
            for(j=0;j<s.length();++j){
                maxCost-=Math.abs(s.charAt(j) - t.charAt(j));
                if(maxCost<0){
                        maxCost+=Math.abs(s.charAt(i) - t.charAt(i));
                        ++i;
                }
            }
            return j-i;
    }
}
