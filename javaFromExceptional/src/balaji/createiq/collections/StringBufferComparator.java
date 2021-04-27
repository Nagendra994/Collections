package balaji.createiq.collections;

import java.util.Comparator;

public class StringBufferComparator implements Comparator<StringBuffer>{
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		System.out.println(o1+"  And  "+o2+"  Return value:  "+(o1.toString().compareTo(o2.toString())));
		
		return o1.toString().compareTo(o2.toString());
	}
	

}
