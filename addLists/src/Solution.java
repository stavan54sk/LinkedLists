

import java.util.HashSet;

public class Solution {
	
	public static void main(String[] args) {
		Node node1=new Node(7);
		Node node2=new Node(1);
		Node node3=new Node(6);
		Node node4=new Node(5);
		Node node5=new Node(9);
		Node node6=new Node(2);
		node1.next=node2;
		node2.next=node3;
		node4.next=node5;
		node5.next=node6;
		Node result=new Solution().adddLists(node1,node4,0);
		new Solution().printNode(result);
	}
	
	public Node adddLists(Node n1,Node n2,int carry){
		Node head;Node n = null;head=n;
		while(n1!=null && n2!=null) {
			int result=0;
			result=result+carry+n1.data+n2.data;
			int digit=result%10;
			carry=result/10;
			Node nn=new Node(digit);
			if(n!=null) {
				n.next=nn;
				n=n.next;}
			else {
				n=nn;
				head=n;
			}
			n1=n1.next;
			n2=n2.next;
		}
		if(carry!=0) {
			Node l=new Node(carry);
			n.next=l;
			}
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
