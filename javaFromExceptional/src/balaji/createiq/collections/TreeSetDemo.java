package balaji.createiq.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		set.add( 87);
		set.add(25);
		set.add(50);
		set.add(12);
		System.out.println(set);
		
		
		Set<StringBuffer> set1 = new TreeSet<>(new StringBufferComparator());
		set1.add(new StringBuffer("Balaji"));
		set1.add(new StringBuffer("Nagendra"));
		set1.add(new StringBuffer("karthik"));
		set1.add(new  StringBuffer("kiran"));
		System.out.println(set1);
		
		
		
		
		
		
		
	}

}
