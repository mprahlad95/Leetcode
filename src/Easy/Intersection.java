package Easy;

public class Intersection {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode a = headA;
	        ListNode b = headB;
	        ListNode nexta = null, nextb = null;
	        while(a.next != null && b.next != null) {
	            if (a.val == b.val) 
	                return a;
	            else {
	                nexta = a.next;
	                nextb = b.next;
	                a = a.next;
	                b = b.next;
	            }
	        }
	        return a;
	    }
	}
