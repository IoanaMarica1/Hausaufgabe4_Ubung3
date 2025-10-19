import java.util.Arrays;

public class BigNumbers {
    public int[] Summe(int[] x, int[] y){
        int maxLen;
        if(x.length>y.length){
            maxLen = x.length;
        }
        else{
            maxLen = y.length;
        }
        int[] result = new int[maxLen+1];
        int carry = 0;
        for(int i=0; i<maxLen; i++){
            int xi, yi;
            if (i < x.length) {
                xi = x[i];
            } else {
                xi = 0;
            }
            if (i < y.length) {
                yi = y[i];
            } else {
                yi = 0;
            }
            carry = carry + xi + yi;
            result[i] = carry % 10;
            carry /= 10;
        }
        if(carry > 0){
            result[maxLen] = carry;
        }
        if(result[maxLen] == 0){
            result = Arrays.copyOf(result, maxLen);
        }
        return result;
    }
}
