package com.javaex.ex01;

public class Goods {
	
	private String camera;
	private String computer;
	private String cup;
	
	
	public Goods(String camera, String computer, String cup) {
		this.camera = camera;
		this.computer = computer;
		this.cup = cup;
	}
	
	public void showInfo() {
		System.out.println(camera + "  " + computer + "  " + cup);
	}
	
	
	
	/*
	//�ʵ�
	private String name;
	private int price;
	
	//������
	
	
	//�޼ҵ�-����//����
	
	
	//�޼ҵ�-�Ϲ�
	
	//name ����ϴ� ���
	public void setName(String n) {
		name = n; //"����", "LG�׷�", "�ӱ���"
		//return ������ ����
	}
	
	//name �о��ִ� ���
	public String getName() {
		
		return name;
		
	}
	
	//price ����ϴ� ���
	public void setPrice(int p) {
		price = p;
	}
	
	//price �о��ִ� ���
	public int getPrice() {
		
		return price;
	}
	
	//name,price ����ϴ� ���
	public void showInfo() {
		System.out.println("��ǰ�̸�: " + name + ", ����: " + price);
	}
	*/

}
