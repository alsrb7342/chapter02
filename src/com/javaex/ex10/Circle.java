package com.javaex.ex10;

public class Circle extends Shape implements Drawable{
	//�ʵ�
	private int radius;

	//������
	public Circle() {
		super();
	}
	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	//�޼ҵ� g/s
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}


	//�޼ҵ� �Ϲ�
	public void draw() {
		System.out.println("��-���:" + fillColor + " ��-����:" + lineColor + " ��-������" + radius);
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	
	

}
