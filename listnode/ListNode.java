package com.wadas.listnode;

/**
 * @author: longfellow
 * @date: 2020/4/20
 */
public class ListNode<T> {
    public T val;
    public ListNode<T> next;

    public ListNode(T val, ListNode<T> next) {
        this.val = val;
        this.next = next;
    }
}