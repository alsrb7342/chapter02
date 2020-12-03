package com.javaex.ex10;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//point ���̽�
		Point p = new Point(3, 3);
		p.draw();
		System.out.println(p.getX());
		
		Drawable pp = new Point(6, 6);
		pp.draw();
		//pp.getX(); ������ ����
		
		((Point)pp).getX();//�ٿ�ĳ���� �ؼ� ���
		
		//�� + ���� �Բ� ����
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("����", "����", 4, 8);
		Drawable c01 = new Circle("��Ȳ", "��Ȳ", 5);
		Drawable t01 = new Triangle("���", "���", 10, 10);
		Drawable p01 = new Point(5, 5);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//��ü �׸���
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		System.out.println("==========================================");
		
		//��ü �����׸��� --> Point������ ����.
		//���������� area() ���࿡ Point ����
		for(int i=0; i<dArray.length; i++) {
			//�θ� shape�̸� ����
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}

	}

}
