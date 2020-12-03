package com.javaex.ex10;

public class Ractangle extends Shape implements Drawable{
	//�ʵ�
	private int width;
	private int height;
	
	//������
	public Ractangle() {
		super();
	}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
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
		System.out.println("�簢��-���:" + fillColor + " �簢��-����:" + lineColor + " �簢��-����:" + width + " �簢��-����:" + height);
	}
	
	public double area(){
		
		//double area = width * height;
		
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	

}
