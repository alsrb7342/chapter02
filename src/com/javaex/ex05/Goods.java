package com.javaex.ex05;

public class Goods {
	
	//�ʵ�
	private String name;
	private int price;
	
	//������ - �޸𸮿� �ø���.
	
	//1 
	public Goods() {} //�ٸ� �����ڰ� ������ ������ �� ����.
	
	public Goods(String name) {
		this.name = name;
	}

	//2
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Goods(int price) {
		this.price = price;
	}
	
	//�޼ҵ� getter / setter

	public String getName() {
		return name;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("��ǰ��: " + name +",  ����:"+  price);
	}
	
	
	
	

}
