
import org.junit.Test;

/**
 * @Description:寻找数组的中心索引测试
 * @Author:BigRedCaps
 */
public class Solution_PivotIndexTest
{
    int nums[] = {1, 7, 3, 6, 5, 6};
    Solution_PivotIndex solution_pivotIndex = new Solution_PivotIndex();
    @Test
    public void pivotIndex_one ()
    {
        System.out.println(solution_pivotIndex.pivotIndex_one(nums));
    }

    @Test
    public void pivotIndex_Two ()
    {
        System.out.println(solution_pivotIndex.pivotIndex_Two(nums));
    }

    @Test
    public void pivotIndex_Three ()
    {
        System.out.println(solution_pivotIndex.pivotIndex_Three(nums));
    }
}
