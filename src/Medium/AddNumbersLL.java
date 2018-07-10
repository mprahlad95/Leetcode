package Medium;

public class AddNumbersLL {
	public static ListNode sumTwoLinkedLists(ListNode input1, ListNode input2) {
	    int carry = 0;
	    ListNode current, add = new ListNode(0);
	    current = add;
	    while (input1 != null || input2 != null || carry != 0) {
	        if (input1 != null) {
	            carry += input1.val;
	            input1 = input1.next;
	        }
	        if (input2 != null) {
	            carry += input2.val;
	            input2 = input2.next;
	        }
	        current.next = new ListNode(carry%10);
	        carry /= 10;
	        current = current.next;
	    }
	    return add.next;
	}
}
