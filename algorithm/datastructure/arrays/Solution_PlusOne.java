/**
 * @Description:#66加一问题
 * @Author:BigRedCaps
 */
public class Solution_PlusOne {
    /**
     * 思路：根据是否进位来解题：
     *      若最高位进位，那么比它低的位的数字都为9，且加1后都为0，需要初始化一个长度为(lenght+1)的新数组，0位置为1代表
     *      进位；
     *      若若最高位不进位，那么不需要产生新数组，后续数字由更低位计算而来；
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1==10){
                digits[i]=0;
            }else{
                digits[i]+=1;
                break;
            }
        }
        if(digits[0]==0){
            int[] result = new int[digits.length+1];
            result[0]=1;
            return result;
        }
        return digits;
    }
}