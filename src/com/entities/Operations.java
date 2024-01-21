package com.entities;

public class Operations {
private int a;
private int b;
double aa;
double bb;
float aaa;
float bbb;

public Operations(int a, int b, double aa, double bb, float aaa, float bbb) {
	super();
	this.a = a;
	this.b = b;
	this.aa = aa;
	this.bb = bb;
	this.aaa = aaa;
	this.bbb = bbb;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public double getAa() {
	return aa;
}
public void setAa(double aa) {
	this.aa = aa;
}
public double getBb() {
	return bb;
}
public void setBb(double bb) {
	this.bb = bb;
}
public float getAaa() {
	return aaa;
}
public void setAaa(float aaa) {
	this.aaa = aaa;
}
public float getBbb() {
	return bbb;
}
public void setBbb(float bbb) {
	this.bbb = bbb;
}
public int add(){
	return this.a+b;
}
public double add(double a,double b){
	return a+b;
}
public float add(float f1,float f2){
	return f1+f2;
}
}
