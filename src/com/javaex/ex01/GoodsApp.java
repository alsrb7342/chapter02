package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	 
	 Goods s01 = new Goods("니콘", "LG그램", "머그컵");
	 
	 s01.showInfo();
	 
	 
	 
	 //캡슐화 때문에 사용 불가
	 /*
	 camera.name = "니콘";
	 camera.price = 400000;
	 
	 System.out.println(camera.name);
	 System.out.println(camera.price);
	 
	 
	 camera.setName("니콘");
	 String name = camera.getName();
	 
	 camera.setPrice(400000);
	 int price = camera.getPrice();
	 
	 camera.showInfo();
	 */
	 /*
	 System.out.println("");
	 
	 Goods computer = new Goods();
	 
	 computer.name = "LG그램";
	 computer.price = 1000000;
	 
	 System.out.println(computer.name);
	 System.out.println(computer.price);
	 
	 System.out.println("");
	 
	 Goods Household = new Goods();
	 
	 Household.name = "머그컵";
	 Household.price = 2000;
	 
	 System.out.println(Household.name);
	 System.out.println(Household.price);
	 
	 camera.price = 450000;
	 
	 System.out.println(camera.name);
	 System.out.println(camera.price);
	 */

	}

}
