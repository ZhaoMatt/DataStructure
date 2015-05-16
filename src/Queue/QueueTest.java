package Queue;

public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLList<Integer> qList = new QueueLList<Integer>();
		qList.enqueue(1);
		qList.enqueue(2);
		qList.enqueue(3);
		qList.enqueue(4);
		qList.dequeue();
		qList.enqueue(5);
		System.out.println(qList.getSize());
		System.out.println(qList.toString());
	}

}
