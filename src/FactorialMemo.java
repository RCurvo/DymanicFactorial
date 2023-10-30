import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FactorialMemo {
    public static BigInteger[] facMap = new BigInteger[10001];

    public static BigInteger factorialMemo(long n){
        for (int i = 0; i < 10001; i++){
            facMap[i] = BigInteger.valueOf(-1);
        }
        return factorial(n);
    }
    public  static BigInteger factorial(long n){
        if (facMap[(int) n].compareTo(BigInteger.valueOf(-1))!=0){
            return facMap[(int) n];
        }
        if (n <= 1l){
            facMap[(int) n] = BigInteger.valueOf(1l);
            return facMap[(int) n];
        }
        facMap[(int) n] = factorial(n-1).multiply(BigInteger.valueOf(n));
        return facMap[(int) n];
    }

    public static void main(String[] args) {
        System.out.println(factorialMemo(1000));
    }
}
