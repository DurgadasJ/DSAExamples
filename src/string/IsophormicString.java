package string;
import java.util.HashMap;
public class IsophormicString {
    public static void main(String[] args) {
        String s = "egg", t = "add";

        boolean bol = isIsomorphic( s,  t);
        System.out.println(bol);
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();
        if(s.length()!= t.length()){
            return s.length()== t.length();
        }
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) {
                    return false;
                }
            } else {
                mapST.put(chS, chT);
            }

            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) {
                    return false;
                }
            } else {
                mapTS.put(chT, chS);
            }
        }
        return true;
    }
}
