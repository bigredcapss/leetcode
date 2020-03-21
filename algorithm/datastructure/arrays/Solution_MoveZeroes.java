/**
 * @Description:#283 移动零
 * @Author:BigRedCaps
 */
public class Solution_MoveZeroes
{
    /**
     *思路：只要把数组中所有的非零元素，按顺序给数组的前段元素位赋值，剩下的全部直接赋值0；
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index += 1;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
