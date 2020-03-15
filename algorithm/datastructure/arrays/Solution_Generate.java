import java.util.ArrayList;
import java.util.List;

/**
 * @Description:#118杨辉三角
 * @Author:BigRedCaps
 */
public class Solution_Generate
{
    /**
     * 思路：利用每一行的第一个和最后一个元素总是1，中间元素是左上方和右上方的元素之后来解题；
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        //if user input zero row,they will get zero row
        if(numRows == 0){
            return triangle;
        }

        //first row is always [1]
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);

        for(int rowNum = 1;rowNum<numRows;rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            //the first element is always 1 each rows
            row.add(1);

            //triangle each element(except the first and last of each row)
            //is equals to the sum of the elements top left and top right
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            //the last element is always 1 each rows
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
