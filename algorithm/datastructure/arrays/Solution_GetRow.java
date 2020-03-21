import java.util.ArrayList;
import java.util.List;

/**
 * @Description:#119 杨辉三角II
 * @Author:BigRedCaps
 */
public class Solution_GetRow
{
    /**
     *思路：杨辉三角有很多特性：
     *1.每行数字左右对称，由 1 开始逐渐变大
     *2.第 n 行的数字有 n 项
     *3.第 n 行的第 m 个数和第 n – m + 1 个数相等 ，为组合数性质之一
     *4.( a + b )n的展开式中的各项系数依次对应杨辉三角的第 ( n + 1 ) 行中的每一项
     *5.对于杨辉三角的同一行，第 ( i + 1) 项是第 i 项的( k - i ) /( i + 1 ) 倍
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        long index = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int) index);
            index = index * ( rowIndex - i ) / ( i + 1 );
        }
        return res;
    }
}
