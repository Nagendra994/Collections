package PracticeRandom;



public class HasCodeEg {
	static int count=12;
	public static void main(String[] args) {
		Employee s1=new Employee(11, "ram");
		System.out.println(s1.hashCode());
		Employee s2=new Employee(19, "michael");
		System.out.println(s2.hashCode());
	}
	public int hascode() {
		return count++;
		
	}

}
