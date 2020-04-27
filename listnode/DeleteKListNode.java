package com.wadas.listnode;

/**
 * @author: longfellow
 * @date: 2020/4/27
 */
public class DeleteKListNode {
    /*
     * 寻找到数第K个指针
     */
    public ListNode delKListNode(ListNode head, int k) {
        // 异常判断，链表及k是否小于0
        if (head == null || k <= 0) {
            return null;
        }

        // 判断K是否大于链表长度
        ListNode temp = head;
        for (int i = 0; i < k-1; i++) {
            if (temp.next!= null) {
                temp =temp.next;
            } else {
                return null;
            }
        }

        // 初始化快慢指针
        ListNode fast = head;
        ListNode slow = head;

        // 快指针先走k-1步。
        for (int i = 0; i < k-1; i++) {
            fast = fast.next;
        }

        // 快慢指针的距离是K，当快指针到达链表尾端时即满指针是倒数K个
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.val = slow.next.val;
        slow.next = slow.next.next;

        return head;
    }
}
