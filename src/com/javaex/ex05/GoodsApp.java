package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ Goods()
		// settet ���
		// showInfo() Ȯ��
		Goods camera = new Goods();
		
		camera.setName("����");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		// ������ Goods(String name, int price)
		// setter ��� x
		// showInfo() Ȯ��
		Goods computer = new Goods("LG�׷�", 1000000);
		
		computer.showInfo();
		
		// ������ Goods(String name)
		// setter ��� setPrice();
		// showInfo() Ȯ��
		Goods cup = new Goods("�ӱ���");
		cup.setPrice(2000);
		
		cup.showInfo();
		
		
		
		

	}

}
