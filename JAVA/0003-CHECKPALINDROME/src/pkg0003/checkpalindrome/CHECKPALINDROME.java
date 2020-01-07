package pkg0003.checkpalindrome;

public class CHECKPALINDROME {
    static boolean checkPalindrome(String is) {
        for (int i = 0; i < is.length(); i++) {
            if (is.charAt(i) != is.charAt((is.length() - 1) - i )){
                return false;
            }
        }
        return true;
    }
}
