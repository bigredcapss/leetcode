/**
 * @Description:#26 删除排序数组中的重复项
 * @Author:BigRedCaps
 */
public class Solution_RemoveDuplicates
{
    /**
     *思路：数组中第一个元素始终不变，通过设置游标，指向数组中第二个元素，通过后者覆盖前者改变数组中的元素；
     *注意：数组中删除元素，就是后面的元素覆盖前面的元素；
     */
    public int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
            }
        }
        return k;
    }
}
