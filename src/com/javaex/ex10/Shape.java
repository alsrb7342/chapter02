package com.javaex.ex10;

public abstract class Shape {
	//�ʵ�
	protected String fillColor;
	protected String lineColor;
	
	
	//������
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}


    //�޼ҵ� g/s
    public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//�޼ҵ� �Ϲ�
	//draw()�� ����� ���� --> �������̵� �̿�
	//public 
	public abstract double area();

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	

	
}
