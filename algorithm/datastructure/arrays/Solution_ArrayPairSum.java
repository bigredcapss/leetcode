import java.util.Arrays;

/**
 * @Description:#561 数组拆分I
 * @Author:BigRedCaps
 */
public class Solution_ArrayPairSum
{
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length-1;i=i+2){
            sum+=Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }
}
