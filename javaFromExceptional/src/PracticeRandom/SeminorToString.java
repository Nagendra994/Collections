
package PracticeRandom;

public class SeminorToString {
private int age;
private String name;
private String course;

public SeminorToString() {
	super();
}
public SeminorToString(int age, String name, String course) {
	super();
	this.age = age;
	this.name = name;
	this.course = course;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "SeminorToString [age=" + age + ", name=" + name + ", course=" + course + "]";
}



	
	
	
}
