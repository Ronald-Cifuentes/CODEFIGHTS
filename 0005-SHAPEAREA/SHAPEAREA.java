import javax.swing.JOptionPane;

public class SHAPEAREA{
    
    public static void main(String[] Args){
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero para sacar el cuadrado: "));
        JOptionPane.showMessageDialog(null,""+shapeArea(x));
    }

    public static int shapeArea(int n) {
        return 2*((int)Math.pow((n-1), 2))+(2*(n-1))+1;
    }

}
