package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p01 = new Point();
		
		p01.setX(1);
		p01.setY(5);
		
		/*
		String str = p01.toString();
		System.out.println(str);
		*/
		
		//System.out.println(p01.toString());
		
		p01.draw();
		
	    //Point() ������
		//setter ���
		//draw() ���� �׸���.
		
		Point p02 = new Point(100, 200);
		p02.draw(true);
		
		//Point(int x, int y) ������ ���
		//setter ��� x
		//draw() ���� �׸���.
		
		Point p03 = new Point(100);
		p03.setY(200);
		p03.draw(false);
		
		//Point(int x) ������ ���
		//setter ���
		//draw() ���� �׸���.
		
		
	

	}

}
