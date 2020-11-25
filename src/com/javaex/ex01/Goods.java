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
	//필드
	private String name;
	private int price;
	
	//생성자
	
	
	//메소드-겟터//세터
	
	
	//메소드-일반
	
	//name 등록하는 기능
	public void setName(String n) {
		name = n; //"니콘", "LG그램", "머그컵"
		//return 생략이 가능
	}
	
	//name 읽어주는 기능
	public String getName() {
		
		return name;
		
	}
	
	//price 등록하는 기능
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어주는 기능
	public int getPrice() {
		
		return price;
	}
	
	//name,price 출력하는 기능
	public void showInfo() {
		System.out.println("상품이름: " + name + ", 가격: " + price);
	}
	*/

}
