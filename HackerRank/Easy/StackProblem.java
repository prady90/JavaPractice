
import java.util.*;


class StackProblem {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		// Deque<String> s = new ArrayDeque<String>();
		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalanced(input) ? "true" : "false");
		}
		sc.close();

	}

	private static boolean isBalanced(String input) {
		java.util.Stack<String> s = new java.util.Stack<String>();
		for (int i = 0; i < input.length(); i++) {
			String temp = String.valueOf(input.charAt(i));
			if (s.empty()) {
				s.push(temp);
			} else {
				switch (temp) {

					case "}":
						if (s.peek().equals("{")) {
							s.pop();
						}
						break;
					case "]":
						if (s.peek().equals("[")) {
							s.pop();
						}
						break;
					case ")":
						if (s.peek().equals("(")) {
							s.pop();
						}
						break;
					default: s.push(temp);

				}

			}
		}
		return (s.isEmpty());
	}

}
