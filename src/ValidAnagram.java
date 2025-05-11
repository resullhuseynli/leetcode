import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        List<Character> myChars = new ArrayList<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i=0 ; i<s.length() ; i++) {
            myChars.add(s.charAt(i));
        }

        for (int j=0 ; j<t.length() ; j++) {
            char myChar = t.charAt(j);
            if (myChars.contains(myChar)) {
                myChars.remove(Character.valueOf(myChar));
            } else {
                return false;
            }
        }

        return true;

    }
}
class Solution2 {
    public boolean isAnagram(String s, String t) {

        List<Character> charsOfT = new ArrayList<>();
        List<Character> charsOfS = new ArrayList<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i=0 ; i < s.length() ; i++) {
            charsOfT.add(t.charAt(i));
            charsOfS.add(s.charAt(i));
        }

        Collections.sort(charsOfT);
        Collections.sort(charsOfS);

        if (charsOfT.equals(charsOfS)) {
            return true;
        }

        return false;

    }
}
