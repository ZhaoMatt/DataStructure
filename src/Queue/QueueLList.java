package Queue;

public class QueueLList<T> implements Queue<T> {

	private Node<T> front,rear;
	private int size;
	
	public QueueLList()
	{
		front=new Node<T>();
		rear = front;
		size=0;
	}
	public QueueLList(T[] elements)
	{
		this();
		for(int i=0;i<elements.length;i++)
		{
			Node<T> pNode = new Node<T>(elements[i],null);
			rear = pNode;
			size++;
		}
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size==0;
	}

	@Override
	public void enqueue(T x) {
		// TODO Auto-generated method stub
		Node<T> pNode = new Node<T>(x,null);
		this.rear.next = pNode;
		this.rear = pNode; 
		size++;
		System.out.println("add"+rear.data);
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if(size<1)
			return null;//should throw error!!
		Node<T> pNode =front.next; 
		T x = pNode.data;
		this.front.next = pNode.next;
		this.size--;
		if (this.size<1)
			this.rear = this.front;
		System.out.println("dequeue"+x);
		return x;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return this.front.next.data;
	}
	
	@Override
	public String toString()
	{
		System.out.println("From front to rear");
		String str = "(";
		Node<T> pNode = this.front.next;
		while(pNode!=this.rear)
		{
			str+=pNode.data.toString()+",";
			pNode = pNode.next;
		}
		str+=this.rear.data+")";
		return str;
	}
	
}
