import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description:#485 最大连续1的个数
 * @Author:BigRedCaps
 */
public class Solution_FindMaxConsecutiveOnes
{
    /**
     *思路：遍历数组，记录“1”连续出现的次数，并保存在List中，取List中的最大值
     */
    public int findMaxConsecutiveOnes(int[] nums) {
        //保存1出现的次数
        List<Integer> record = new ArrayList<>();
        //用于记录"1"出现的次数
        int flag = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                flag++;
            }else{
                flag=0;
            }
            record.add(flag);
        }
        return Collections.max(record);
    }
}
