/**
 * @Description:#167 两数之和II-输入有序数组
 * @Author:BigRedCaps
 */
public class Solution_TwoSum
{
    /**
     *思路：初始化开始指针 start 指向数组起始，初始化尾指针 end 指向数组结尾；
     *根据已排序这个特性：
     *（1）如果 numbers[start] 与 numbers[end] 的和 temp 小于 target ，说明应该增加 temp ，因此start右移指向一个较大的值。
     *（2）如果 temp大于 target ，说明应该减小 temp ，因此 end 左移指向一个较小的值。
     *（3）temp 等于 target ，则找到，返回 start + 1 和 end + 1。（注意以 1 为起始下标）
     */
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start] + numbers[end];
            if (temp == target)
                return new int[]{start + 1, end + 1};
            else if (temp < target)
                start++;
            else
                end--;
        }
        return null;
    }
}
