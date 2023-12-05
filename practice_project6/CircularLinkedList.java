package practice_project6;

class Node{

	int value;
	Node nextAddress;
	public Node(int value) {
		this.value = value;
		this.nextAddress = null;
	}

}


public class CircularLinkedList {

	private Node start;

	public CircularLinkedList() {
		start = null;
	}

	public void insert(int value) {
		Node n1=new Node(value);

		if(start == null) {
			start=n1;
			start.nextAddress=start;

		}

		else if (value <= start.value) {
			n1.nextAddress = start;
			Node current = start;
			while (current.nextAddress != start) {
				current = current.nextAddress;
			}
			current.nextAddress = n1;
			start = n1;
		}else {
			
		
		Node current = start;
		while (current.nextAddress != start && current.nextAddress.value<value) {
			current = current.nextAddress;
		}
		n1.nextAddress=current.nextAddress;
		current.nextAddress=n1;
		}

	}
	public void display() {
		if(start==null) {
			System.out.println("circular linked list is null");
			return;
		}
		
		Node current=start;
		do {
			System.out.println(current.value+ " ");
			current=current.nextAddress;
		}
		
		 while (current != start);
        System.out.println();
    }
		

	public static void main(String[] args) {
		CircularLinkedList cr=new CircularLinkedList();
		
		cr.insert(24);
		cr.insert(15);
		cr.insert(29);
    	cr.insert(12);


		System.out.println("The sorted circular linked list: ");
		cr.display();
	}



}
