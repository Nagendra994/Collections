package com.createiq.clone;

public class Account {
	
private String aname;
private double abal;
private int aid;
public Account() {
	super();
}
public Account(String aname, double abal, int aid) {
	super();
	this.aname = aname;
	this.abal = abal;
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public double getAbal() {
	return abal;
}
public void setAbal(double abal) {
	this.abal = abal;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
@Override
public String toString() {
	return "Account [aname=" + aname + ", abal=" + abal + ", aid=" + aid + "]";
}
@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}




}
