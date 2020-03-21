/**
 * @Description:#151 反转字符串里的单词
 * @Author:BigRedCaps
 */
public class Solution_ReverseWords
{
    /**
     *思路：与第一次提交思路相同；这里仅仅改为使用StringBuilder
     *运用trim()函数除去首尾的空格
     *运用split()函数将字符串中的单词分割开，存入字符串数组中
     *创建StringBuilder对象，将分割出来的单词依次按照要求添加到StringBuilder中
     */
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        if(s == null || "".equals(s.trim())){
            return "";
        }

        String[] str = s.trim().split(" +");
        for(int i = str.length-1; i >= 0; i--){
            if(i == 0){
                sb.append(str[i]);
            }else{
                sb.append(str[i] + " ");
            }
        }
        return sb.toString();
    }
}
