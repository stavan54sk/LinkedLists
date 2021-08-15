public class Solution {
	
	public static void main(String[] args) {
		Node node1=new Node('a');
		Node node2=new Node('b');
		Node node3=new Node('c');
		Node node4=new Node('b');
		Node node5=new Node('a');
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		node4.next=node5;
		System.out.println(new Solution().palindromeLinkedList(node1));
		
	}
	
	public boolean palindromeLinkedList(Node head) {
		Node n = head;Node lhead = null;
		while (n != null) {
				lhead=insertNodeToLeft(lhead, n.data);
				n=n.next;
		}
		return isEqual(head, lhead);
	}
	
	public Node insertNodeToLeft(Node head,char n){
		Node node=new Node(n);
		node.next=head;
		head=node;
		return node;
	}
	
	public boolean isEqual(Node n1,Node n2) {
		while(n1!=null && n2!=null)
		{
			if(!(n1.data==n2.data))
				return false;
			n1=n1.next;
			n2=n2.next;
		}
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
