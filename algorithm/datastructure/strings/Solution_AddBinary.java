/**
 * @Description:#67二进制求和
 * @Author:BigRedCaps
 */
public class Solution_AddBinary
{
    /**
     * 思路：输入字符串可利用 chatAt() 方法（用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。）转化为char字符，
     * 减去字符 ‘0’，得 int 型数值 0 或 1 ，分别与sum累加；
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int lenA = a.length(), lenB = b.length();
        StringBuilder sb = new StringBuilder();
        int i = lenA - 1, j = lenB - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';//减'0'是为了转化为int
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2); //sum%2得余数，即为该位最终数字
            carry = sum / 2; //carry记录是否进一位
        }
        if (carry != 0) {
            sb.append(carry); //将StringBuilder所得倒置后即为答案，转为String返回
        }
        return sb.reverse().toString();
    }
}
