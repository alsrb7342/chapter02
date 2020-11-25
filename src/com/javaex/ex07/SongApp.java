package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성자 0
		Song s01 = new Song();
		
		s01.setTitle("좋은날");
		s01.setArtist("아이유");
		s01.setAlbum("Real");
		s01.setComposer("이민수");
		s01.setYear("2010");
		s01.setTrack(3);
		
		s01.draw();
		
		
		//생성자 6
		Song s02 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		
		s02.draw();
		
		//생성자 2 타이틀, 아티스트
		Song s03 = new Song("벚꽃엔딩", "버스커버스커");
		
		s03.setAlbum("버스커버스커1집");
		s03.setComposer("장범준");
		s03.setYear("2012");
		s03.setTrack(4);
		
		s03.draw();
		
		//생성자 2 타이틀, 트랙
		Song s04 = new Song("DINOSAUR", 1);
		
		s04.setArtist("악동뮤지션");
		s04.setAlbum("SUMMER EPISODE");
		s04.setComposer("이찬혁");
		s04.setYear("2017");
		
		s04.draw();
		//System.out.println(p01.toString());
		

	}

}
