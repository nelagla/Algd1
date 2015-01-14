/**
 * Created by AA on 28/10/14.
 */
public class LinearSearchPalindrome {
    public static void main(String[] args){
    String s = "anna";
    System.out.println(linearSearchPalindrome(s));
    }
    public static boolean linearSearchPalindrome(String s){
      int i = 0;
        while (i < (s.length()/2) && s.charAt(i) == s.charAt((s.length()-1)-i)) {
            i++;
        }
        return (i >= s.length() / 2);
    }
}
