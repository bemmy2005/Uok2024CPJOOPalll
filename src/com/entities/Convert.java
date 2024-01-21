package com.entities;

public class Convert {
double va1;
double val2;
static double convert=2.9870;
public Convert() {}
public Convert(double va1, double val2) {
	super();
	this.va1 = va1;
	this.val2 = val2;
}
public double getVa1() {
	return va1;
}
public void setVa1(double va1) {
	this.va1 = va1;
}
public double getVal2() {
	return val2;
}
public void setVal2(double val2) {
	this.val2 = val2;
}
public static double convertion() {
	return convert*100;
}
@Override
public String toString() {
	return "Convert [va1=" + va1 + ", val2=" + val2 + "]";
}

}
