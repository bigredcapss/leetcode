/**
 * @Description:#557 反转字符串中的单词III
 * @Author:BigRedCaps
 */
public class Solution_ReverseWordsIII
{
    /**
     *思路：
     *①：将字符串切割，之后将每一个单词都倒置，最后连接起来。
     *②：将整个字符串倒置，然后切割，然后切割字符串，并倒序输出。
     */
    public String reverseWords(String s) {
        String str = reverse(s);
        String[] arr = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = arr.length - 1; i >= 0; i--){

            if(i > 0)
                sb.append(arr[i] + " ");
            else
                sb.append(arr[i]);
        }
        return sb.toString();
    }

    public String reverse(String str){
        char[] c = str.toCharArray();
        int start = 0, end = c.length - 1;

        while(start < end){
            char temp = c[end];
            c[end] = c[start];
            c[start] = temp;
            start++;
            end--;
        }
        return String.valueOf(c);
    }
}
