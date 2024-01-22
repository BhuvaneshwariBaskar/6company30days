package Atlassian;

import java.util.Arrays;


    class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int j=0;int i=0;
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if((s[j]>=g[i])){
                ans++;
                j++;
                i++;
            }
            else j++;
        }
        return ans;
    }
}

