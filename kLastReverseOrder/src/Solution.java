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
		new Solution().kLastReverseOrder(node1,4);
	}
	
	public int kLastReverseOrder(Node head,int k){
		Node n=head;int index=0;
			if(n==null)
				return 0;
			index=kLastReverseOrder(n.next,k)+1;
			if(index<=k)
			System.out.println(index+"th Element from Last:"+n.data);
			return index;
	}
	
}
