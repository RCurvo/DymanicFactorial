import java.math.BigInteger;

public class FactorialTabu {

    public  static BigInteger factorial(long n){
        if (n <= 1l){
            return BigInteger.valueOf(1l);
        }
        BigInteger[] results = new BigInteger[(int) (n+1)];
        results[0] = BigInteger.valueOf(1);
        results[1] = BigInteger.valueOf(1);

        for (int i =2; i<=n;i++){
            results[i] = BigInteger.valueOf(i).multiply(results[i-1]);
        }

        return results[(int) n];
    }

    public static void main(String[] args) {
        System.out.println(factorial(10l));
    }
}
