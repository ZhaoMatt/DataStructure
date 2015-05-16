package Stack;

import Stack.Node;

public class StackList<T> implements Stack<T>{
	
	private Node<T> top ;
	private int size;
	public StackList()
	{
		this.top = null;
		this.size = 0;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size==0;//return top==null;
	}
	@Override
	public void push(T x) {
		// TODO Auto-generated method stub
		if (x==null)
			return;
		Node<T> p = new Node<T>(x, top);
		top = p;
//		System.out.println(top.data);
		size++;
		
	}
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T x = top.getData();
		if(top==null)
		{
			return null;
		}
		top = top.next;
		size--;
//		System.out.println(x.toString());
		return x;
	}
	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return top.data;
	}
	public int size()
	{
		return size;
	}
	public String toString(){  
        String str="(";  
        //Node<T> p =this.top.next; 
        while(top!=null)
        {
        	System.out.println(top.data.toString());
        	
        	str +=top.data.toString();
        	if(top.next != null)
        		str+=",";
        	top=top.next;
        }
        return str+=")";  
    }  
}
