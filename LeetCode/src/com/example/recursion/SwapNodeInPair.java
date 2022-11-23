package com.example.recursion;

public class SwapNodeInPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = head.next;
		ListNode third = head.next.next;
		newHead.next = head;
		head.next = swapPairs(third);
		return newHead;
	}

}


