//Create a Stack of strings. Push 3 strings onto the stack and then search for a specific string to find its position in the stack.
import java.util.Stack;
public class SearchString {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();
        st.push("c++");
        st.push("Java");
        st.push("Python");
        String SearchString="Java";
        int position=st.search(SearchString);
        if (position != -1) {
            System.out.println(SearchString + " is found at position: " + position);
        } else {
            System.out.println(SearchString + " is not found in the stack.");
        }
    } 
}
    

