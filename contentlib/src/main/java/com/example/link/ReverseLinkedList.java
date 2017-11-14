package com.example.link;

/**
 * Created by y on 2017/11/14.
 */

public class ReverseLinkedList {


    public static class ListNode {

        public ListNode next;
        public int value = -1;

        ListNode(int var) {
            value = var;

        }
    }

    public static void initListNode() {
        ListNode list0 = new ListNode(1);
        ListNode list1 = new ListNode(2);
        list0.next = list1;
        ListNode list2 = new ListNode(3);
        list1.next = list2;
        ListNode list3 = new ListNode(4);
        list2.next = list3;

        ListNode temp = list0;
        System.out.println("-------------正序输出----------------");
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);

        System.out.println("-------------重新排序----------------");


        ListNode curernt = list0;
        ListNode prev = null;
        ListNode next = null;
        while (curernt != null) {
            System.out.println(curernt.value);
            ListNode tempNext = curernt.next;
            curernt.next = prev;
            prev = curernt;
            curernt = tempNext;
        }

        System.out.println("-------------重新排序完成----------------");

        temp = list3;
        System.out.println("-------------输出逆序---------------");
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);

    }
}
