package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	private int x1;
	private int y1;
	
	// x��ǥ
	public void setName(int n) {
		x = n;
	}
	
	public int getName() {
		return x;
	}
	//y��ǥ
	public void setName1(int a) {
		y = a;
	}
	
	public int getName1() {
		return y;
	}
	
	//���
	public void showInfo() {
		System.out.println("��[x=" + x + ", y=" + y + "]�� �׷Ƚ��ϴ�");
	}
	
	//x1��ǥ
	public void setName2(int b) {
		x1 = b;
	}
	
	public int getName2() {
		return x1;
	}
	
	//y1��ǥ
	
	public void setName3(int c) {
		y1 = c;
	}
	
	public int getName3() {
		return y1;
	}
	
	//���
	public void showInfo1() {
		System.out.println("��[x=" + x1 + ", y=" + y1 + "]�� �׷Ƚ��ϴ�");
	}
}
