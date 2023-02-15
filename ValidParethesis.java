import java.util.*;
class ValidParethesis{


	public boolean isValid(String s){
		Stack<Character> st = new  Stack<>();
		for(char c:s.toCharArray()){
			if(c  == '('||c == '{'||c == '['){
                st.push(c);
            }

else if(c==')'&& !st.isEmpty() &&  st.peek()=='(') 
        {
            st.pop();
        }
else if(c=='}'&& !st.isEmpty() &&  st.peek()=='{') 
        {
            st.pop();
        }
else if(c==']'&& !st.isEmpty() &&  st.peek()=='[') 
        {
            st.pop();
        }
        else{
            return  false;
        }
        }
return st.isEmpty();
    }
}

	