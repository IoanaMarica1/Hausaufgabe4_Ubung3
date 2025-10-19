import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BigNumbers bn = new BigNumbers();

        int[] a = {0,0,0,0,0,0,0,3,1};
        int[] b = {0,0,0,0,0,0,0,7,8};
        int c = 2;

        int[] sum = bn.Summe(a, b);
        System.out.println("Summe: " + arrayToString(sum));

        int[] diff = bn.Differenz(a, b);
        System.out.println("Differenz: " + arrayToString(diff));

        int[] prod = bn.Multiplikation(a, c);
        System.out.println("Produkt: " + arrayToString(prod));

        int[] quot = bn.Division(prod, c);
        System.out.println("Quotient: " + arrayToString(quot));
    }

    public static String arrayToString(int[] x) {
        int[] normal = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            normal[i] = x[x.length - 1 - i];
        }
        return Arrays.toString(normal);
    }
}
