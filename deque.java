import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
public class deque {

	public static void main(String[] args) {
	Deque <String> de=new LinkedList<String>();
	Stack <String>st=new Stack<>();
    de.add("dimpi"); 
    de.add("salia");
    de.add("satya");
    de.add("dhanya");
    de.add("kavi");
    de.add("shweti");
    
    st.add("snehi");
    st.add("prami");
    st.add("shitu");
    st.add("niku");
    st.add("varshu");
   	st.add("ruti");
   	
    de.pop();
    de.push("adi");
	st.pop();
	st.push("adi");
		
	Iterator<String>itr2=de.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	System.out.println("\n");
	Iterator<String>itr=st.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
