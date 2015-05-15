package List;

public class Reverse {
	
	public static <T> void Reverse(LinkedList<T> list) 
	{
		Node<T> pNode = list.head.next;
		Node<T> succ=null,front = null;
		while(pNode!=null)
		{
			succ = pNode.next;
			pNode.next= front;
			front = pNode;
			pNode=succ;
		}
		list.head.next=front;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value[]={"A","B","C","D","E","F"};  
        //SinglyLinkedList<String> list = new SinglyLinkedList<String>(value);  
        LinkedList<String> list = new LinkedList<String>(value);  
        System.out.println("list: "+list.toString());  
        Reverse(list);  
        System.out.println("After Reverse: "+list.toString()); 
	}

}
