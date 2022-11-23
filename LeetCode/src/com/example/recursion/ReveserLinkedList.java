package com.example.recursion;

public class ReveserLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode resetHead = reverseList(head.next);
		(head.next).next = head;
		head.next = null;

		return resetHead;
	}

}

