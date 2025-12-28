import java.util.Arrays;

/**
 * @author peanut
 * @description # 11 盛最多水的容器
 */
public class Solution_MaxArea {


    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution_MaxArea().maxArea(height));
    }


    /**
     * 暴力解法 时间复杂度 O(n^2) 空间复杂度 O(1)
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        if (height == null || height.length == 0){
            return 0;
        }
        if (height.length == 1){
            return height[0];
        }

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(max, area);
            }
        }

        return max;
    }

    /**
     * 双指针 时间复杂度 O(n) 空间复杂度 O(1)
     * @param height
     * @return
     */
    public int maxArea_twoPointer(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }
        if (height.length == 1){
            return height[0];
        }

        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }

        }
        return max;


    }
}
