package com.javaex.ex10;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//point 테이스
		Point p = new Point(3, 3);
		p.draw();
		System.out.println(p.getX());
		
		Drawable pp = new Point(6, 6);
		pp.draw();
		//pp.getX(); 보이지 않음
		
		((Point)pp).getX();//다운캐스팅 해서 사용
		
		//점 + 도형 함께 관리
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강", "빨강", 4, 8);
		Drawable c01 = new Circle("주황", "주황", 5);
		Drawable t01 = new Triangle("노랑", "노랑", 10, 10);
		Drawable p01 = new Point(5, 5);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		//전체 그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		System.out.println("==========================================");
		
		//전체 면적그리기 --> Point면적이 없다.
		//순차적으로 area() 만약에 Point 제외
		for(int i=0; i<dArray.length; i++) {
			//부모가 shape이면 실행
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}

	}

}
