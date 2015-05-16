package Stack;

import java.util.Scanner;

public class baseConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input the number in 10 base: ");
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		System.out.print("Input the target base system(<=10): ");
		int j = sc.nextInt();
		StackList<Integer> stack = new StackList<Integer>();
		while(i>0)
		{
			int n = i%j;
			stack.push(n);
			i = i/j;
		}
		while(stack.size()>0)
			System.out.print(stack.pop());
	}

}
