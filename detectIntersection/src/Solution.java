public class Solution {

	public static void main(String[] args) {
		Node node1 = new Node(7);
		Node node2 = new Node(1);
		Node node3 = new Node(6);
		Node node4 = new Node(5);
		Node node5 = new Node(9);
		Node node6 = new Node(2);
		node1.next = node2;
		node2.next = node3;
		node4.next = node5;
		node5.next = node6;
		System.out.println(new Solution().detectIntersection(node1, node4));

	}

	public boolean detectIntersection(Node n1, Node n2) {
		Node an = null;
		Node t1 = getTail(n1);
		Node t2 = getTail(n2);

		int l1 = getLength(n1);
		int l2 = getLength(n2);

		if (l1 > l2) {
			an = advanceNode(n1, l1 - l2);
			while (n2.next != null) {
				if (an == n2)
					return true;
				n2 = n2.next;
				an = an.next;
			}
		} else {
			an = advanceNode(n2, l2 - l1);
			while (n1.next != null) {
				if (an == n1)
					return true;
				n1 = n1.next;
				an = an.next;
			}
		}
		return false;
	}

	public Node advanceNode(Node n1, int n) {
		while (n>0) {
			n1 = n1.next;
			n--;
		}
		return n1;
	}

	public int getLength(Node n1) {
		int length = 0;
		while (n1 != null) {
			length++;
			n1 = n1.next;
		}
		return length;
	}

	public Node getTail(Node n1) {
		while (n1.next != null) {
			n1 = n1.next;
		}
		return n1;
	}

	public void printNode(Node head) {
		Node n = head;
		while (n != null) {
			System.out.print(" " + n.data);
			n = n.next;
		}

	}

}
