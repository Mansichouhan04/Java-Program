//Create a Stack of 5 numbers. Pop all the elements one by one and print each element as it is removed.
import java.util.Stack;
public class PopAllElements 
{
    public static void main(String[] args) {
        Stack <Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while(!st.isEmpty())
        {
        System.out.println(st.pop());
        }
    }
}
