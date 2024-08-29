package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P022_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);//4
		list.add("java");//4
		list.add(143432);//4
		list.add(false);//1
		list.add('f');//1
		list.add(23453.34534);//8
		list.add(1);//4
		
		System.out.println(list);
		list.add(234.4645);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(343.3);//8
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
