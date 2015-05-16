package Stack;

public class Node<T> {

	public T data;
	public Node<T> next;
	public Node(T data,Node<T> next)
	{
		this.data = data;
		this.next = next;
	}
	public Node()
	{
		this(null,null);
	}
	public String toString()
	{
		return this.data.toString();
	}
	public boolean equals(Object obj)
	{
		return obj== this || obj instanceof Node && this.data.equals(((Node<T>)obj).data);
	}
	public void setData(T x){  
        this.data = x;  
    }  
      
    public T getData(){  
        return this.data;  
    }  
      
    public void setNext(Node<T> next){  
        this.next = next;  
    }  
      
    public Node<T> getNext(){  
        return this.next;  
    }  

}
