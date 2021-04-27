package PracticeRandom;


public class Employee {
	int emid;
	String ename;

	public Employee(int emid, String ename) {
		super();
		this.emid = emid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + "]";
	}

//	@Override
//	public boolean equals(Object obj) {
//
//		try {
//			Employee e = (Employee) obj;
//
//			if (this.emid == e.emid && this.ename.equals(e.ename)) {
//				return true;
//			}
//		} catch (Exception e) {
//			return false;
//		}
//		return false;
//
//	}
//
//	@Override
//	public int hashCode() {
//		return emid + ename.hashCode();
//	}

}
