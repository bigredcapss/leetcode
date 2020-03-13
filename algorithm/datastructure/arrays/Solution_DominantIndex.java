package algorithm.datastructure.arraysandstrings;

import java.util.Arrays;

/**
 * @Description: #747 至少是其它数字两倍的最大数
 * @Author:BigRedCaps
 */
public class Solution_DominantIndex
{
    /**
     * 思路1：获取最大值，用最大值依次去除数组中的值，除本身外商全部大于2的，则为结果；
     * @param nums
     * @return
     */
    public int dominantIndex_One(int[] nums)
    {
        int[] nums_copy=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums_copy[i]=nums[i];
        }
        Arrays.sort(nums_copy);
        int max=nums_copy[nums_copy.length-1];
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=max&&nums[j]!=0&&max/nums[j]<2)
                return -1;
            else if(nums[j]==max)
                i=j;
        }
        return i;
    }

    /**
     * 思路2：遍历数组，找出最大值与次大值，若满足最大值>=次大值*2，则为结果；
     * @param nums
     * @return
     */
    public int dominantIndex_Two(int[] nums)
    {
        if (nums.length < 2)
            return 0;
        int max1 = 0, max2 = 0, index = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] > max1)
            {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2)
                max2 = nums[i];
        }
        return max1 >= max2 * 2 ? index : -1;
    }


}
