import java.util.HashMap;
import java.util.Map;

/**
 * @author peanut
 * @description  #1 两数之和
 */
public class Solution_TwoNumSum {

    /**
     * 暴力解法 时间复杂度O(n^2) 空间复杂度O(1)
     * @param numArray 数组
     * @param target 目标值
     * @return 返回索引
     */
    public static int[] twoSum(int[] numArray, int target)
    {
        if (numArray == null || numArray.length == 0){
            return null;
        }
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if (numArray[i] + numArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 哈希表 时间复杂度O(n) 空间复杂度O(n)
     * @param numArray 数组
     * @param target 目标值
     * @return 返回索引
     */
    public static int[] twoSum_hash(int[] numArray, int target)
    {
        if (numArray == null || numArray.length == 0){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numArray.length; i++) {
            int temp = target - numArray[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(numArray[i], i);
        }
        return null;

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //Solution_TwoNumSum solution = new Solution_TwoNumSum();
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }


}
