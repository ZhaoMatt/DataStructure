package Stack;

public interface Stack<T> {

	int getSize();
	//判断堆栈是否为空
	boolean isEmpty();
	//数据元素 e 入栈
	void push(T x);
	//栈顶元素出栈
	T pop() ;
	//取栈顶元素
	T peek();
}
