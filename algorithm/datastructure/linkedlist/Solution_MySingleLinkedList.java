/**
 * @Description: #707 设计单链表
 * @Author:BigRedCaps
 */
public class Solution_MySingleLinkedList
{
    class Node {//定义Node
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    class MyLinkedList {

        Node head;//头
        Node tail;//尾
        int size = 0;//链表长度

        public MyLinkedList() {//初始化数据
            head = new Node(0);//为了方便初始化一个本不存在的head，值为0
            tail = head;//初始下尾也指向和头同一个对象
            size = 0;
        }

        public int get(int index) {
            if (index >= size || index < 0) {//index不在查找区间返回-1
                return -1;
            }
            Node cur = head;
            for (int i = 0; i <= index; i++) {//从head一个一个向下遍历，到index
                cur = cur.next;
            }
            return cur.val;//返回值
        }

        public void addAtHead(int val) {
            Node temp = head.next;//temp对象是真实链表的第一个节点（因为head一直是初始化的 0 ）
            head.next = new Node(val);//构造的虚拟节点head的下一个节点指向新插入的节点
            head.next.next = temp;//新插入节点指向原本第一个真实节点
            size++;//计数
            if (size == 1) {
                tail = head.next;//如果只有一个节点此时尾节点也指向新加入的节点
            }
        }

        public void addAtTail(int val) {//添加尾节点
            tail.next = new Node(val);//把尾节点下一个对象指向新加入节点即可
            tail = tail.next;//刷新尾节点为新加入的节点
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {//插入值不在范围直接返回。
                return;
            }
            Node cur = head;//当前节点从头节点开始
            for (int i = 0; i < index; i++) {//遍历到 插入位置的前一个节点 因为要求是插入到index的前面
                cur = cur.next;
            }
            Node temp = cur.next;//暂存当前节点的下一个节点
            cur.next = new Node(val);//把当前节点下一个对象指向新节点
            if (index == size) {
                tail = cur.next;//如果插入位置刚好是最后一个则把尾节点指向新加入节点
            }
            cur.next.next = temp;//新节点的下一个节点指向暂存节点位置
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index >= size || index < 0) {
                return;
            }
            Node cur = head;//从头节点遍历到index目标节点的前一个节点 因为要删除目标节点
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }

            cur.next = cur.next.next;//目标节点前一个节点的下一个节点指向目标节点的下一个节点
            size--;//刷新节点数量
            if (cur.next == null) {
                tail = cur;
            }
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
