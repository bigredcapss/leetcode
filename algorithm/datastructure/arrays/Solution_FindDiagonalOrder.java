/**
 * @Description:#498对角线遍历
 * @Author:BigRedCaps
 */
public class Solution_FindDiagonalOrder
{
    /**
     思路：利用数组元素的索引和与遍历对角线方向的关系解题
     若索引和为偶数：
     ①元素在最后一列，往下走；
     ②元素在第一行，往右走；
     其他情况，往右上走；
     若索引和为奇数：
     ③元素在最后一行，往右走；
     ④元素在第一列，往下走；
     其他情况，往左下走；
     注意：①②的顺序和③④的顺序不能调整；否则会数组越界；
     */
    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix.length == 0) {return new int[0];}
        int m = matrix.length;// 待处理的矩阵有M行、N列
        int n = matrix[0].length;
        int[] result = new int[m * n];// 用来存放遍历的结果
        int r = 0;int c = 0;//用来控制二维数组的行列
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[r][c];
            //若和为偶数
            if ((r + c) % 2 == 0)
            {
                if (c == n - 1)
                { // 元素在最后一列，往下走
                    r++;
                }
                else if (r == 0)
                { // 元素在第一行，往右走
                    c++;
                }
                else
                { // 其他情况，往右上走
                    r--;
                    c++;
                }
            }
            else //若和为奇数
            {
                if (r == m - 1)
                { //元素在最后一行，往右走
                    c++;
                } else if (c == 0)
                { // //元素在第一列，往下走
                    r++;
                } else
                { //其他情况，往左下走
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
