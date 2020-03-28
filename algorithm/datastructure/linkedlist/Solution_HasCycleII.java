/**
 * @Description:#142  环形链表II
 * @Author:BigRedCaps
 */
public class Solution_HasCycleII
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
     * 思路：利用双指针，假设链表的起始节点为 A，环的入口节点为 B，两个指针（快慢指针）相交节点为 C，AB 两点之间的长度为
     * x，BC 两点之间的长度为 y，CB 两点之间的长度为 z。慢指针 slow 走过的长度为 x+y，快指针 fast 为了“赶上”慢指针，
     * 应该走过的长度为 x+y+z+y，同时，由于    快指针的速度是慢指针的两倍，因此相同时间内，快指针走过的路程应该是慢指针
     * （走过的路程）的两倍，即x+y+z+y=2(x+y)，化简得，x=z;因此，    如果此时有另外一个慢指针 slow2 从起始节点 A 出发，
     * 则两个慢指针会在节点 B （环的入口）相遇;
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){

                    ListNode slow2 = head;
                    while(slow2 != slow){
                        slow = slow.next;
                        slow2 = slow2.next;
                    }
                    return slow;
                }
            }
            return null;
        }
    }
}
