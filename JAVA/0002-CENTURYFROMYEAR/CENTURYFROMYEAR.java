import javax.swing.JOptionPane;

public class CENTURYFROMYEAR {
    
    public  static void main(String[] Args){
        JOptionPane.showMessageDialog(null,"1905 es el siglo: "+centuryFromYear(1905));
    }

    public static int centuryFromYear(int year) {
        return (int)(Math.ceil(((double)year)/100));
    }

}