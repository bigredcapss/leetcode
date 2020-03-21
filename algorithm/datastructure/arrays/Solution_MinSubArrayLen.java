/**
 * @Description:#209 长度最小的子数组
 * @Author:BigRedCaps
 */
public class Solution_MinSubArrayLen
{
    /**
     *思路：首先可以将元素尽量多地累计起来，让它们的和超过s，再按数组的索引，从小到大去掉一
     * 些元素，使元素和逼近s，并保持元素和大于等于s。这个时候，通过一左一右两个指针（索引）
     * 就可以计算出最小连续数组的长度。
     */
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < len; i++)
        {
            sum += nums[i]; // 把前i个元素累加起来
            while (sum >= s)
            {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++]; // 依次剔除元素，使sum尽量接近s
            }
        }
        return (ans != Integer.MAX_VALUE)? ans : 0;
    }
}
