/**
 * @Description:# 160 相交链表
 * @Author:BigRedCaps
 */
public class Solutin_GetIntersectionNode
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
     * 思路：双指针法：假设指针 pA 和 pB 分别指向链表 A 和链表 B 的头结点，之后两个指针分别以步幅为 1 的速度向链表的尾部
     * 遍历，当指针 pA 遍历到链表 A 的尾节点时，将指针 pA 指向链表 B 的头部。同样地，当指针 pB 遍历到链表 B 的尾节点时，
     * 将指针pB指向链表 A 的头部。当两个指针相遇时，指针 pA 或者 pB 所指向的节点就是两个链表的相交节点。
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
