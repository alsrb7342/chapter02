package com.javaex.ex10;

public class Triangle extends Shape implements Drawable{
	//�ʵ�
	private int width;
	private int height;
	
	
	//������
	public Triangle() {
		super();
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//�޼ҵ� g/s
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	//�޼ҵ� �Ϲ�
	public void draw() {
		System.out.println("�ﰢ��-���:" + fillColor + " �ﰢ��-����:" + lineColor + " �簢��-����:" + width + " �簢��-����:" + height);
	}
	
	public double area(){
		
		//double area = width * height;
		
		return width * height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	


	

}
