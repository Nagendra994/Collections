package PracticeRandom;
 
public class Hasshcode {
	int k;
	String name;
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + k;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Hasshcode other = (Hasshcode) obj;
//		if (k != other.k)
//			return false;
//		return true;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + k;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hasshcode other = (Hasshcode) obj;
		if (k != other.k)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		String i = new String("Nagendra");
      	Integer j= new Integer(50);
      //	int m=j;
		Hasshcode has = new Hasshcode();
		has.k=50;
		has.name= "Nagendra";
		Hasshcode has1 = new Hasshcode();
		has1.k=50;
		has1.name= "Nagendra";
		
//		int hashvalue=i.hashCode();
//		int hashvalue1 = k.hashCode();
//		System.out.println("The output of the code is "+hashvalue);
		System.out.println("hashcode :  "+i.hashCode());
		System.out.println(has.hashCode());
		System.out.println(has1.hashCode());
		System.out.println(j.hashCode());
	
	}

}
