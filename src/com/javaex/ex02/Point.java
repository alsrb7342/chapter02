package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	private int x1;
	private int y1;
	
	// xÁÂÇ¥
	public void setName(int n) {
		x = n;
	}
	
	public int getName() {
		return x;
	}
	//yÁÂÇ¥
	public void setName1(int a) {
		y = a;
	}
	
	public int getName1() {
		return y;
	}
	
	//Ãâ·Â
	public void showInfo() {
		System.out.println("Á¡[x=" + x + ", y=" + y + "]À» ±×·È½À´Ï´Ù");
	}
	
	//x1ÁÂÇ¥
	public void setName2(int b) {
		x1 = b;
	}
	
	public int getName2() {
		return x1;
	}
	
	//y1ÁÂÇ¥
	
	public void setName3(int c) {
		y1 = c;
	}
	
	public int getName3() {
		return y1;
	}
	
	//Ãâ·Â
	public void showInfo1() {
		System.out.println("Á¡[x=" + x1 + ", y=" + y1 + "]À» ±×·È½À´Ï´Ù");
	}
}
