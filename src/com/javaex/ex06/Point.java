package com.javaex.ex06;

public class Point {
	
	


	//�ʵ�
	
	private int x;
	private int y;
	
	//������
	public Point() {
		
	}
	

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	public Point(int x) {
		this.x = x;
	}
	
	/*����Ҽ� ����. ???
	 * public Point(int y) {
		this.y = y;
	}*/


	//�޼ҵ� getter setter
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	
	//�޼ҵ� �Ϲ�
	public void draw() {
		System.out.println("��[X=" + x + "  Y=" + y + "]�� �׷Ƚ��ϴ�.");
	}
	
	public void draw(boolean opt) {
		if(opt == true) {
			System.out.println("��[X=" + x + "  Y=" + y + "]�� �׷Ƚ��ϴ�.");
		}
		else{
			System.out.println("��[X=" + x + "  Y=" + y + "]�� �������ϴ�.");
		}
	}
	
	@Override//�׽�Ʈ��
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	


	
	

}
