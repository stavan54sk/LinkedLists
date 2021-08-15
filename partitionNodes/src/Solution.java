

import java.util.HashSet;

public class Solution {
	
	public static void main(String[] args) {
		Node node1=new Node(50);
		Node node2=new Node(40);
		Node node3=new Node(30);
		Node node4=new Node(20);
		Node node5=new Node(10);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		new Solution().printNode(new Solution().partitionNodes(node1,35));
		
	}
	
	public Node partitionNodes(Node head, int i) {
		Node n = head;Node lhead = null;Node rhead=null;
		while (n != null) {
			if (n.data >= i) {
				rhead=insertNodeToRight(rhead, n.data);
			} else {
				lhead=insertNodeToLeft(lhead, n.data);
			}
			n=n.next;
		}
		n=lhead;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=rhead;
		return lhead;
	}
	
	public Node insertNodeToLeft(Node head,int n){
		Node node=new Node(n);
		node.next=head;
		head=node;
		return node;
	}
	
	public Node insertNodeToRight(Node head,int i){
		if(head==null)
			return new Node(i);
		Node n=head;
		while(n.next!=null) 
			n=n.next;
		Node nn=new Node(i);
		n.next=nn;
		return head;
	}
	
	public void printNode(Node head) {
		Node n=head;
		while(n!=null) {
			System.out.print(" "+n.data);
			n=n.next;
			}
		
	}


}
