package Stack;

import java.util.Scanner;
import java.util.regex.Matcher;

public class bracketMatch {

	public static boolean Match(String str) 
	{
		StackList<Character> stack= new StackList<Character>();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			switch(c)
			{
				case '{':
				case '[':
				case '(':
					stack.push(c);
					break;
				case ')':
					if(!stack.isEmpty()&&stack.pop()=='(')
						break;
					else return false;
				case ']':
					if(!stack.isEmpty()&&stack.pop()=='[')
						break;
					else return false;
				case '}':
					if(!stack.isEmpty()&&stack.pop()=='{')
						break;
					else return false;
				
			}
		}
		if (stack.isEmpty()==true)
			return true;
		else 
			return false;
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(Match(str))
			System.out.println("brachet matched!");
		else
			System.out.println("there are some errors for bracket");
	}

}
