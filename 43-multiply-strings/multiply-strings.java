import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger bn = new BigInteger(num1);
        BigInteger bi = new BigInteger(num2);

        BigInteger result = bi.multiply(bn);

        return result.toString();
    }
}