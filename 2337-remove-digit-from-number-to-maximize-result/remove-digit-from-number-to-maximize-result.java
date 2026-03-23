class Solution {
    public String removeDigit(String number, char digit) {
        String maxStr = "";

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                StringBuilder sb = new StringBuilder(number);
                sb.deleteCharAt(i);

                String newStr = sb.toString();

                if (maxStr.equals("") || newStr.compareTo(maxStr) > 0) {
                    maxStr = newStr;
                }
            }
        }

        return maxStr;
    }
}