import java.util.*;
// Duplicate Parenthesis
/*
 *  T.C. is O(n) ans S.C. is also O(n)
 *  
 */
public class class18 {
    public static boolean containsDuplicateParenthesis(String s){
        ArrayDeque<Character> st = new ArrayDeque<>();
		int n = s.length();

		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == ')') {
				int count = 0;
				while(st.peek() != '(') {
					st.pop();
					count++;
				}
				st.pop();
				if(count == 0)	return true;
			}
			else st.push(s.charAt(i));
		}
		return false;
    }
    public static void main(String[] args) {
        
        System.out.println(containsDuplicateParenthesis("(a+b)+((c+d))"));

    }
}