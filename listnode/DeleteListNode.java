package com.wadas.listnode;

/**
 * @author: longfellow
 * @date: 2020/4/27
 */

public class DeleteListNode {
    public ListNode delListNode (ListNode head, ListNode target){
        if (target == null) return head;

        // 需要判断target是否是最后一个节点
        if (target.next != null) {
            target.val = target.next.val;
            target.next = target.next.next;
        } else {
            ListNode temp = head;
            while(temp.next != target) {
                temp = temp.next;
            }
            temp.next = null;
        }
        return head;
    }
}
