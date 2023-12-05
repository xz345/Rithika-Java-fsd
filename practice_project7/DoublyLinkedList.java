package practice_project7;



class Node1{
	int value;
	Node1 prev;
	Node1 next;
	public Node1(int value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}
	
}

public class DoublyLinkedList {

	private Node1 start;
	
	
	
	public DoublyLinkedList() {

		this.start=null;
	}


	public void insert(int value) {
		
		Node1 n2=new Node1(value);
		
		if(start==null) {
			start=n2;
			
		}
		else {
            Node1 current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n2;
            n2.prev = current;
        }
		
	}
		public void forward() {
			Node1 current=start;
			System.out.println("Forward traversal:");
			while(current!=null) {
				System.out.println(current.value+" ");
				current=current.next;
			}
			
			System.out.println();
			
		}
		
		public void reverse() {
			
			Node1 current=start;
			if(current==null) {
				System.out.println("List is empty");
				return;
			}
			
			
			  while (current.next != null) {
		            current = current.next;
		        }

		        System.out.println("Backward traversal:");
		        while (current != null) {
		            System.out.print(current.value + " ");
		            current = current.prev;
		        }
		        System.out.println();
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dl=new DoublyLinkedList();
		
		dl.insert(24);
		dl.insert(15);
		dl.insert(29);
    	dl.insert(12);


		dl.forward();
        dl.reverse();		
		
			
	}

}
