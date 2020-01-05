import javax.swing.JOptionPane;

public class CHECKPALINDROME {
    public static void main(String[] Args){
        JOptionPane.showMessageDialog(null,"aabaa Espalindrome?: "+String.valueOf(checkPalindrome("aabaa")));
    }

    public static boolean checkPalindrome(String is) {
        for (int i = 0; i < is.length(); i++) {
            if (is.charAt(i) != is.charAt((is.length() - 1) - i )){
                return false;
            }
        }
        return true;
    }

}