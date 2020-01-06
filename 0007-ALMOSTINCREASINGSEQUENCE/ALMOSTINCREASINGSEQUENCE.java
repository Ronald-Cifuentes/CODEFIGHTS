import javax.swing.JOptionPane;

public class ALMOSTINCREASINGSEQUENCE {
    public static void main(String[] Args){
        int a[]={1, 2, 1, 2};
        JOptionPane.showMessageDialog(null,"La secuencia [1, 2, 1, 2] se vuelve creciente al eliminar un elemento?: "+ String.valueOf(almostIncreasingSequence(a)));
    }
    public static boolean almostIncreasingSequence(int[] s) {
        boolean r=true;
        int s1=0,s2=0;
        int i;
        for(i=0;i<s.length-1;i++){
            if(s[i]>=s[i+1]){s1++;}
        }
        for(i=0;i<s.length-2;i++){
            if(s[i]>=s[i+2]){s2++;}
        }
        if(s1+s2>2){r=false;}
        return r;
    }
}