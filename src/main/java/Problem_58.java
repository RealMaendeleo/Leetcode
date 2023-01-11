/**
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 */

public class Problem_58 {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        int n = words.length;
        return words[n - 1].length();
    }
}