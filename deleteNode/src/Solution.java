public class Solution {
	
	public static void main(String[] args) {
		Node node1=new Node(10);
		Node node2=new Node(20);
		Node node3=new Node(30);
		Node node4=new Node(20);
		Node node5=new Node(50);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		new Solution().deleteNode(node3);
		new Solution().printNode(node1);
	}
	
	public boolean deleteNode(Node n){
		if(n==null && n.next==null)
			return false;
		n.data=n.next.data;
		n.next=n.next.next;
		return true;
	}
	public void printNode(Node head) {
		Node n=head;
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
			}
		
	}
}
