package algorithm.datastructure.arraysandstrings;

/**
 * @Description: #724 寻找数组的中心索引
 * @Author:BigRedCaps
 */
public class Solution_PivotIndex
{
    /**
     * 思路1：暴力破解法：直接算出左边和和右边和，直接比较；
     * @param nums
     * @return
     */
    public int pivotIndex_one(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0;j<i;j++)
            {
                leftSum += nums[j];
            }
            for(int k=i+1;k<nums.length;k++)
            {
                rightSum += nums[k];
            }
            if(leftSum == rightSum)
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * 思路2：基于当前位置的左侧和 * 2 + 当前值 = 数组和，即为中心索引
     * @param nums
     * @return
     */
    public int pivotIndex_Two(int[] nums)
    {
        int sum = 0;
        int leftSum = 0;
        int index = -1;
        for(int item:nums)
        {
            sum += item;
        }
        for (int i = 0; i < nums.length; i++)
        {
            // 如果当前位置的左侧和 * 2 + 当前值 = 数组和，即为中心索引
            if (leftSum * 2 + nums[i] == sum)
            {
                index = i;
                break;
            }
            // 累计左侧和
            leftSum += nums[i];
        }
        return index;
    }

    /**
     * 思路3：基于右边和=数组数值的总和-左边和-中心索引的值，获取中心索引
     * @param nums
     * @return
     */
    public int pivotIndex_Three(int[] nums)
    {
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int item:nums)
        {
            sum += item;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                leftSum = 0;
            }
            else
            {
                leftSum +=nums[i-1];
            }
            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum)
            {
                return i;
            }
        }
        return -1;

    }
}
