import java.util.HashMap;

public class BullsCows {
   
    public String getHint(String secret, String guess) {
     HashMap<Character, Integer> s = new HashMap<>();
        HashMap<Character, Integer> g = new HashMap<>();
        int bull = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++) {
            char st = secret.charAt(i);
            char gt = guess.charAt(i);

            if (st == gt) {
                bull++;
            } else {
                s.put(st, s.getOrDefault(st, 0) + 1);
                g.put(gt, g.getOrDefault(gt, 0) + 1); 
            }
        }
        for (char ch : s.keySet()) {
            if (g.containsKey(ch)) {
                cows += Math.min(s.get(ch), g.get(ch));
            }
        }
        return bull + "A" + cows + "B";
    }
}