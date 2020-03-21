/**
 * @Description:#344 反转字符串
 * @Author:BigRedCaps
 */
public class Solution_ReverseString
{
    public void reverseString(char[] s) {
        char temp;
        for(int i=0,j=s.length-1;i<j;i++,j--){
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
}
