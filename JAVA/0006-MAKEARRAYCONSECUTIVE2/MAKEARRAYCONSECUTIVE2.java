import javax.swing.*;
import java.util.Arrays;

public class MAKEARRAYCONSECUTIVE2 {
    public static void main(String[] Args){
        int a[]={6, 2, 3, 8};
        JOptionPane.showMessageDialog(
            null,
            "Para lograr ordenar las estatuillas en los tama\u00f1os [6, 2, 3, 8]\n"+
            "con diferencia de 1 tendrias que conseguir almenos: "+makeArrayConsecutive2(a)+" Estatuillas",
            "Titulo", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    public static int makeArrayConsecutive2(int[] e) {
        int r=0;
        Arrays.sort(e);
        if(e.length-1==0){
            return 0;
        }else{
            for(int i=0;i<e.length-1;i++){
                r+=(e[i+1]-e[i]-1);
            }
            return r;
        }
    }
}