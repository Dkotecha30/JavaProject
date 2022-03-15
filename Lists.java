import java.util.*;
public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second"); //duplicate, is added
		list.add(new Integer(4)); //duplicate, is added
System.out.println(list);
	}

}
