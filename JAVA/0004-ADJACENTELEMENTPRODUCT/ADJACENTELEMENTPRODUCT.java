import javax.swing.JOptionPane;

public class ADJACENTELEMENTPRODUCT {
    public static void main(String[] Args){
        int a[]={3, 6, -2, -5, 7, 3};
        JOptionPane.showMessageDialog(null,"El producto del elemento adyacente para\n inputArray: [3, 6, -2, -5, 7, 3] es: "+adjacentElementsProduct(a));
    }
    public static int adjacentElementsProduct(int[] inputArray) {
        int r=inputArray[0]*inputArray[1];
        for (int i = 0; i < inputArray.length-1; i++) {
            r=((inputArray[i]*inputArray[i+1])>r)?inputArray[i]*inputArray[i+1]:r;
        }
        return r;
    }
}