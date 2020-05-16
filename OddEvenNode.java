package io.test.LinkedList;

public class OddEvenNode {

	public static void main(String[] args) {
		Node node = new Node(1);
		Node one = new Node(2);
		Node two = new Node(3);
		Node three = new Node(4);
		Node four = new Node(5);
		node.next = one;
		one.next = two;
		two.next = three;
		three.next = four;
		printLinkedList(node);
		Node newNode = oddEvenList(node);
		printLinkedList(newNode);

	}

	private static void printLinkedList(Node ll) {
		Node pointerNode = ll;
		if (pointerNode.next != null) {
			while (pointerNode != null) {
				System.out.println(pointerNode.data);
				pointerNode = pointerNode.next;
			}
		}
	}

	public static Node oddEvenList(Node head) {// 1, 2, 3 ,4 ,5
		Node oddNode = head; // 1,2,3,4,5
		Node evenNode = oddNode.next; // 2,3,4,5
		Node evenHead = evenNode;// head node for even

		while (evenNode != null) {
			oddNode.next = evenNode; // -> 2,3,4,5
			oddNode = oddNode.next; // 2,->3,4,5
			evenNode.next = oddNode.next; // ->2,4,5
			evenNode = evenNode.next;
		}
		
		oddNode.next = evenHead;
		return oddNode;
	}

}
