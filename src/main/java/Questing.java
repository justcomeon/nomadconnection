import java.util.Stack;

/**
 * @author Crispin Wang
 * @date 20170410 8:01:56PM
 * @ClassName: Questing
 * @Description: nomadconnection coding test
 */
class Questing {
	/**
	 * @param d:dividend
	 * @return quotient
	 */
	static int quest1(double d) {
		// FIXME
		// calculate
		return (int) d / 2;
	}

	/**
	 * @param s
	 * @return true : elements are paired
	 * @return false : elements are not paired
	 */
	static boolean quest2(String s) {
		// FIXME
		if (s.length() % 2 != 0)
			return false; // in case of S's lenght is odd
		else {
			Stack<Character> stack = new Stack<Character>(); // a stack for	paired brackets
			for (int s_i = 0; s_i < s.length(); s_i++) { // read every digit
				if (stack.isEmpty()) { // push when empty
					stack.push(s.charAt(s_i));
				}
				/* comparing paired brackets */
				else if ((stack.peek() == '{' && s.charAt(s_i) == '}') 
						|| (stack.peek() == '[' && s.charAt(s_i) == ']')
						|| (stack.peek() == '(' && s.charAt(s_i) == ')')) {
					stack.pop(); // one pair finished
				} else {
					// didnt match, push it in to check
					stack.push(s.charAt(s_i));
				}
			}
			/* empty means all elements are paired brackets */
			if (stack.isEmpty())
				return true;
			else
				return false;
		}
	}
}
