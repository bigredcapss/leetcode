/**
 * @Description:#27移除元素
 * @Author:BigRedCaps
 */
public class Solution_RemoveElement
{
    public int removeElement(int[] nums, int val) {
        int k = 0;//该指针指向下次添加的位置
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
