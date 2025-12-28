/**
 * @Description:#28 实现 strStr() 函数:给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1
 * @Author:BigRedCaps
 */
public class Solution_StrStr
{
    /**
     *思路：遍历母子符串，截取母子符串中与子字符串相等的字符，返回子字符串在母子符串中第一次出现的位置
     */
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if (n1 < n2) {return -1;}
        else if ( n2 == 0) {return 0;}
        for (int i = 0; i < n1 - n2 + 1; i++ ){
            if (haystack.substring(i, i+n2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
