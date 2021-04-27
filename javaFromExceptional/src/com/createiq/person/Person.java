package com.createiq.person;

public class Person {

	int Personid;
	String personName;

	public Person() {
		super();
	}

	public Person(int personid, String personName) {
		super();
		this.Personid = personid;
		this.personName = personName;
	}

	public int getPersonid() {
		return Personid;
	}

	public void setPersonid(int personid) {
		Personid = personid;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [Personid=" + Personid + ", personName=" + personName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Personid;
		result = prime * result + ((personName == null) ? 0 : personName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			Person per = (Person) obj;
			if (this.Personid == per.Personid) {
				return true;
			}

		} catch (Exception e) {
			return false;

		}
		return true;
	}
	public boolean equals1(Object obj) {
		try {
			Person per = (Person) obj;
			if (this.personName == per.personName) {
				return true;
			}

		} catch (Exception e) {
			return false;

		}
		return false;
	}

}
