/**
 * @Description:#19 删除链表的倒数第N个节点
 * @Author:BigRedCaps
 */
public class Solution_removeNthFromEnd
{
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /**
     * 思路：第一遍遍历链表获取链表长度；利用链表长度-n=要删除节点的前一个节点，修改节点指针指向，删除元素节点；
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int count = 0;
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            count++;
        }
        //链表只有一个元素节点的情况
        if(count-n+1 ==1){
            return head.next;
        }
        int flag = 1;
        cur = head;
        while(cur!=null){
            if(flag ==count-n){
                cur.next = cur.next.next;
            }
            cur = cur.next;
            flag++;
        }
        return head;
    }
}
