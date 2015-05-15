package List;

import java.awt.Point;

public class LinkedList<T>implements LList<T>{
	/**
	boolean isEmpty();        //判断线性表是否空  
    int length();             //返回线性表长度  
    T get(int i);             //返回第i（i≥0）个元素  
    void set(int i, T x);     //设置第i个元素值为x  
    void insert(int i, T x);  //插入x作为第i个元素  
    void append(T x);         //在线性表最后插入x元素  
    T remove(int i);          //删除第i个元素并返回被删除对象  
    void removeAll();         //删除线性表所有元素  
    T search(T key);          //查找，返回首次出现的关键字为key元素  
    String toString();        //返回显示线性表所有元素值对应的字符串 
	*/
	protected Node<T> head;
	//默认构造方法，构造空单链表。创建头结点，data和next值均为null  
    public LinkedList()  
    {  
        this.head=new Node<T>();  
    } 
    
    public LinkedList(T[] element){  
        
        this(); //创建空单链表，只有头结点  
        Node<T> rear = this.head;//rear指向单链表的最后一个结点  
        /* 
         *若element==null，抛出空对象异常 
         *element.length==0时，构造空链表  
         */  
        for(int i=0;i<element.length;i++){  
            rear.next=new Node<T>(element[i],null);//尾插入，创建结点链入rear结点之后  
            rear=rear.next;//rear指向新的链尾结点  
        }  
    } 
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.head.next==null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		int i=0;
		Node<T> point = this.head.next;
		while(point!=null)
		{
			i++;
			point = point.next;
		}
		return i;
	}
	 public String toString(){  
	        String str="(";  
	        Node<T> p =this.head.next;  
	        while(p!=null){  
	            str+=p.data.toString();  
	            if(p.next!=null){  
	                str +="，";  //不是最后一个结点时后加分隔符          
	            }  
	            p=p.next;  
	        }  
	        return str+=")";  
	    }  
	

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		if(i>=0){  
            Node<T> p=this.head.next;  
            for(int j=0; p!=null&&j<i;j++)  
                p=p.next;  
            if(p!=null)  
                return p.data;//p指向第i个结点  
        }  
        return null;  
	}

	@Override
	public void set(int i, T x) {
		// TODO Auto-generated method stub
		if(x==null)  
            return;//不能设置空对象  
		if(i>=0)
		{
			Node<T> pNode = this.head.next;
			for(int j=0;pNode.next!=null&&j<i;j++)
			{
				pNode = pNode.next;
			}
			pNode.data = x;
		}
		else throw new IndexOutOfBoundsException(i+"");//抛出序号越界异常  
	}

	@Override
	public void insert(int i, T x) {
		// TODO Auto-generated method stub
		if (x==null)
			return;
		if(i>=0)
		{
			Node<T> pNode = this.head;
			for(int j=0;pNode.next!=null&&j<i;j++)
			{
				pNode = pNode.next;
			}
			pNode.next = new Node<T>(x,pNode.next);
		}
	}

	@Override
	public void append(T x) {
		// TODO Auto-generated method stub
		insert(this.length(), x);
	}

	@Override
	public T remove(int i) {
		// TODO Auto-generated method stub
		if(i>0){  
            Node<T> p=this.head;  
            for(int j =0;p.next!=null&&j<i;j++)  
                p=p.next;  
            if(p.next!=null){  
                T old=p.next.data;  
                p.next=p.next.next;  
                return old;  
            }  
        }  
        return null;  
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		this.head.next=null;
	}

	@Override
	public T search(T key) {
		// TODO Auto-generated method stub
		 if (key==null)  
	            return null;  
	        for (Node<T> p=this.head.next;  p!=null;  p=p.next)  
	            if (p.data.equals(key))  
	                return p.data;  
	        return null;  
	      
	}
	
}
