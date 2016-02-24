import java.util.Stack;

public class balanced {
	public static void main(String[] args) {
		boolean isNested = true;
		char[] expression = args[0].toCharArray();
		Stack<Character> pila = new Stack<Character>();
		int parenthesesIsBalanced = 0;
		int bracketIsBalanced = 0;
		int curlyBraceIsBalanced = 0;
		System.out.print("La expresion es: ");
		System.out.println(expression);
		for (char character : expression) {
			switch (character) {
			case '(':
				parenthesesIsBalanced++;
				pila.push(character);
				break;
			case '[':
				bracketIsBalanced++;
				pila.push(character);
				break;
			case '{':
				curlyBraceIsBalanced++;
				pila.push(character);
				break;
			case ')':
				parenthesesIsBalanced--;
				if (pila.peek() == '(') {
					pila.pop();
				} else {
					isNested = false;
				}
				break;
			case ']':
				bracketIsBalanced--;
				if (pila.peek() == '[') {
					pila.pop();
				} else {
					isNested = false;
				}
				break;
			case '}':
				curlyBraceIsBalanced--;
				if (pila.peek() == '{') {
					pila.pop();
				} else {
					isNested = false;
				}
				break;
			}
		}
		if (isNested) {
			System.out.println("La expresion esta bien anidada y bien balanceada");
		} else { if ((parenthesesIsBalanced == 0) && (bracketIsBalanced == 0) && (curlyBraceIsBalanced == 0)) {
				System.out.println("La expresion esta mal anidada y bien balanceada");
			} else {
				System.out.println("La expresion esta mal anidada y mal balanceada");
			}
		}
	}
}