import java.util.ArrayList;
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