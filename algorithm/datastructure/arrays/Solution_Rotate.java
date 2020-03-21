/**
 * @Description:#189 旋转数组
 * @Author:BigRedCaps
 */
public class Solution_Rotate
{
    /**
     *思路：原数组划分为两个部分来看：前 n - k 个元素 [1,2,3,4]和 后k个元素 [5,6,7]，进行分开处理；
     *     定义 reverse 逆转方法：将数组元素反转，比如 [1,2,3,4] 逆转后变成 [4,3,2,1]
     *     对前 n - k 个元素 [1,2,3,4] 进行逆转后得到 [4,3,2,1]
     *     对后k个元素 [5,6,7] 进行逆转后得到 [7,6,5]
     *     将前后元素 [4,3,2,1,7,6,5] 逆转得到：[5,6,7,1,2,3,4]
     *     注意：还要处理 k > 数组长度的情况，对 k 进行取模
     */
    public void rotate(int[] nums, int k) {
        // 旋转即是元素顺序轮转的意思
        if (nums.length < 2 || k < 1 || k % nums.length == 0) {
            return;
        }

        // 处理 k 大于 数组长度的情况
        if (k > nums.length) {
            k = k % nums.length;
        }

        // 对前 n - k 个元素 [1,2,3,4] 进行逆转后得到 [4,3,2,1]
        reverse(nums, 0, nums.length - 1 - k);
        // 对后k个元素 [5,6,7] 进行逆转后得到 [7,6,5]
        reverse(nums, nums.length - k, nums.length -1);
        // 将前后元素 [4,3,2,1,7,6,5] 逆转得到：[5,6,7,1,2,3,4]
        reverse(nums, 0, nums.length - 1);

    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
