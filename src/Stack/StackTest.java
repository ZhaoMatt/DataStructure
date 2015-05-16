package Stack;

public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackList<Integer> stack = new StackList<Integer>();  
        stack.push(1);  
        stack.push(2);  
        stack.push(3);  
        stack.push(4);
        stack.pop();
        stack.push(5);  
        System.out.println(stack.isEmpty());  
        System.out.println(stack.peek());  
        System.out.println(stack.size());  
//      System.out.println(stack.pop());  
//      stack.clear();  
        System.out.println(stack.toString());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.toString());
//        System.out.println(stack.peek());
	}

}
