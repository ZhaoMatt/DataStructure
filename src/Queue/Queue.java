package Queue;

public interface Queue<T> {
	int getSize();
	boolean isEmpty();
	void enqueue(T x);
	T dequeue();
	T peek();
	String toString();
}
