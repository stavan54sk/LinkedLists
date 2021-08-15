

import java.util.HashSet;

public class Solution {
	
	public static void main(String[] args) {
		Node node1=new Node(10);
		Node node2=new Node(10);
		Node node3=new Node(30);
		Node node4=new Node(50);
		Node node5=new Node(50);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		new Solution().removeDuplicate(node1);
		new Solution().printNode(node1);
	}
	
	public Node removeDuplicate(Node head){
	Node n=head;Node previous=null;
	HashSet<Integer> hashSet=new HashSet<Integer>();
	while(n!=null) {
		if(hashSet.contains(n.data)){
			previous.next=n.next;
			}
			else{
				hashSet.add(n.data);
				previous=n;
			}
		n=n.next;
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
