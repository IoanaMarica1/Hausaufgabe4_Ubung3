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
    public int[] Differenz(int[] x, int[] y){
        int len = x.length;
        int[] result = Arrays.copyOf(x, len);
        for(int i=0; i<len; i++){
            int yi;
            if (i < y.length) {
                yi = y[i];
            } else {
                yi = 0;
            }
            if(result[i] > yi){
                result[i]-= yi;
            }
            else{
                int j=i+1;
                while(j<len && result[j] == 0){
                    result[j]=9;
                    j++;
                }
                if(j<len){
                    result[j]--;
                }
                result[i]=10+result[i]-yi;
            }
        }
        int unimportantZero = result.length-1;
        while(unimportantZero > 0 && result[unimportantZero] == 0){
            unimportantZero--;
        }
        result =  Arrays.copyOf(result, unimportantZero+1);
        return result;
    }

}
