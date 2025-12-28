import java.util.HashSet;
import java.util.Set;

/**
 * @Description:# 141 环形链表
 * @Author:BigRedCaps
 */
public class Solution_HasCycle
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
     * 思路1：从头节点向后遍历整个链表只要遍历到节点为 null ，就证明不是环形，而如果遍历到一个节点的地址之前存在过就证明
     * 有环；
     *  注：假设有两个人（双指针）一个快一个慢，不停地向前跑，如果跑得快的那个最后到终点了（遇到空节点 null），就证明是
     *  直线跑道（没有环形链表）。如果是存在环形跑道（环形链表）：两个人一起跑步（双指针）一个快一个慢，那么这两个人因为
     *  速度不同，在环形跑道里跑得快的那个人一定会追上慢的。即两个指针相遇了，证明存在环形链表。
     */
    public boolean hasCycle_One(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {//快指针及其下一位是否为空
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {//如果相遇，存在环形链表
                return true;
            }
        }
        return false;
    }

    /**
     * 思路2： 从头节点向后遍历整个链表只要遍历到节点为 null ，就证明不是环形，而如果遍历到一个节点的地址之前存在过就证明
     * 有环；
     * 注：解决重复问题最容易想到的数据结构就是哈希表，哈希表添加节点时只要发现节点已经存在了，证明就有环形链表；并且哈希
     * 表查找和插入复杂度    都为O(1)，但是空间复杂度会随着原链表长度而增大:O(n)，总的来说：时间复杂度：O(n)，虽然哈希表
     * 的查找和添加操作的时间复杂度是 O(1) ，但是先需要遍历链表然后插入，遍历的复杂度是O(n)；
     * 空间复杂度：O(n)，最多需要保存链表的 n个节点；
     */
    public boolean hasCycle_Two(ListNode head) {
        if (head == null) {return false;}//如果是空链表直接返回
        Set<ListNode> nodeSet = new HashSet<>();//构造哈希表
        while (head.next != null) {//链表下一个不为空
            if (nodeSet.contains(head)) {return true;}//哈希表包含该节点则存在环形链表
            nodeSet.add(head);//加入节点
            head = head.next;//下移一位
        }
        return false;
    }
}
