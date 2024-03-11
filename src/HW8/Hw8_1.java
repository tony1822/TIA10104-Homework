package HW8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw8_1 {
	public static void main(String[] args) {
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
		List li =new ArrayList();
		li.add(new Integer(100));
		li.add(3.14);
		li.add(21L);
		li.add((short)100);
		li.add(5.1);
		li.add("Kitty");
		li.add(new Integer(100));
		li.add(new Object());
		li.add("Snoopy");
		li.add(new BigInteger("1000"));
		//使用Iterator
		Iterator it = li.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
		System.out.println("");
		
		//傳統for
		for(int i=0;i<li.size();i++) {
			System.out.print(li.get(i)+"\t");
		}
		System.out.println("");
		//foreach
		for(Object OA:li) {
			System.out.print(OA+"\t");
		}
		System.out.println("");
		//先移除掉不是Number的
		Iterator it2 = li.iterator();
		while(it2.hasNext()) {
			Object oo =it2.next();
			if(!(oo instanceof Number)) {
				it2.remove();
			}
		}
		//印出來檢查
	        for (Object obj : li) {
	            System.out.print(obj+"\t");
	        }
				
	}
	
}
