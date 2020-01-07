package pkg0004.adjacentelementsproduct;

public class ADJACENTELEMENTSPRODUCT {
    
    public static int adjacentElementsProduct(int[] inputArray) {
        int r=inputArray[0]*inputArray[1];
        for (int i = 0; i < inputArray.length-1; i++) {
            r=((inputArray[i]*inputArray[i+1])>r)?inputArray[i]*inputArray[i+1]:r;
        }
        return r;
    }
    
}
