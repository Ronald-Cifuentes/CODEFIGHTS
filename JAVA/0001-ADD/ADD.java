import javax.swing.JOptionPane;

public class ADD {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"La suma de 1 y 2 es: "+add(1,2));
    }
    
    public static int add(int par1, int par2){
        return par1+par2;
    }
    
}