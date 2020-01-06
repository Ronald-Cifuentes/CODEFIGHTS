import javax.swing.JOptionPane;

public class MATRIXELEMENTSSUM {
    
    public static void main(String[] Args){
        int m[][]=  {{0,1,1,2}, 
                    {0,5,0,0},
                    {2,0,3,3}};
        JOptionPane.showMessageDialog(null,"La salida para la matriz\n"+
        "[[0, 1, 1, 2],\n"+
        " [0, 5, 0, 0],\n"+
        " [2, 0, 3, 3]]\nEs: "+matrixElementsSum(m));
    }

    public static int matrixElementsSum(int[][] matrix) {
        int cn=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=i;k<matrix.length;k++){
                        matrix[k][j]=0;
                    }
                }else{
                    cn+=matrix[i][j];
                }
            }
        }
        return cn;
    }

}