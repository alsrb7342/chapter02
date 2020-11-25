package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song list1 = new Song();
		
		//1 전체
		list1.setTitle("좋은날");
		String title1 = list1.getTitle();
		
		list1.setArtist("아이유");
		String artist1 = list1.getArtist();
		
		list1.setAlbum("Real");
		String album1 = list1.getAlbum();
		
		list1.setComposer("이민수 작곡");
		String composer1 = list1.getComposer();
		
		list1.setYear(2010);
		int year1 = list1.getYear();
		
		list1.setTrack("3번 track");
		String track1 = list1.getTrack();
		
		list1.showInfo();
		
		//2 전체
		
		Song list2 = new Song();
		
		list2.setTitle("거짓말");
		String title2 = list2.getTitle();
		
		list2.setArtist("BIGBANG");
		String artist2 = list2.getArtist();
		
		list2.setAlbum("Always");
		String album2 = list2.getAlbum();
		
		list2.setComposer("G-DRAGON 작곡");
		String composer2 = list2.getComposer();
		
		list2.setYear(2007);
		int year2 = list2.getYear();
		
		list2.setTrack("2번 track");
		String track2 = list2.getTrack();
		
		list2.showInfo();
		
		//3 전체
		
		Song list3 = new Song();
		
		list3.setTitle("벛꽃엔딩");
		String title3 = list3.getTitle();
		
		list3.setArtist("버스커버스커");
		String artist3 = list3.getArtist();
		
		list3.setAlbum("버스커버스커1집");
		String album3 = list3.getAlbum();
		
		list3.setComposer("장범준 작곡");
		String composer3 = list3.getComposer();
		
		list3.setYear(2012);
		int year3 = list3.getYear();
		
		list3.setTrack("4번 track");
		String track3 = list3.getTrack();
		
		list3.showInfo();
		

	}

}
