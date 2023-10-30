import java.math.BigInteger;

public class FactorialRecursive {

    public  static BigInteger factorial(long n){
        if (n <= 1l){
            return BigInteger.valueOf(1l);
        }
        return factorial(n-1).multiply(BigInteger.valueOf(n));
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
