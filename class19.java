import java.util.*;
// Sort a Stack
/*
 *  T.C. O(n^2)
 *  S.C. O(n) as we are using stack 
 * 
 *  Here, we are using 1 stack only.
 *  addInStack is used to insert element in sorted manner i.e in its correct position in the stack.
 *  Thus, we are removing elements one by one until that element is greater than stack.peek().
 *  if it is greater then push element, and then push rest elements. Follow the same for rest also.
 * 
 *  Here, sortStack function is used for sorting using recursion. First pop one element
 *  then call the stack recursively and then add in sorted manner using addInStack function.
 *  
 */
public class class19 {
    public static void sortStack(Stack<Integer> stack) {
		if(stack.isEmpty())
			return;

		int element = stack.pop();
		sortStack(stack);
		addInStack(stack,element);
	}
	public static void addInStack(Stack<Integer> stack, int element) {
		if(stack.isEmpty() || element > stack.peek()) {
			stack.push(element);
			return;
		}
		int temp = stack.pop();
		addInStack(stack, element);
		stack.push(temp);

	}
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(9);
        stack.push(-7);
        stack.push(3);

        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }
}
