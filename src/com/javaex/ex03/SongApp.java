package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song list1 = new Song();
		
		//1 ��ü
		list1.setTitle("������");
		String title1 = list1.getTitle();
		
		list1.setArtist("������");
		String artist1 = list1.getArtist();
		
		list1.setAlbum("Real");
		String album1 = list1.getAlbum();
		
		list1.setComposer("�̹μ� �۰�");
		String composer1 = list1.getComposer();
		
		list1.setYear(2010);
		int year1 = list1.getYear();
		
		list1.setTrack("3�� track");
		String track1 = list1.getTrack();
		
		list1.showInfo();
		
		//2 ��ü
		
		Song list2 = new Song();
		
		list2.setTitle("������");
		String title2 = list2.getTitle();
		
		list2.setArtist("BIGBANG");
		String artist2 = list2.getArtist();
		
		list2.setAlbum("Always");
		String album2 = list2.getAlbum();
		
		list2.setComposer("G-DRAGON �۰�");
		String composer2 = list2.getComposer();
		
		list2.setYear(2007);
		int year2 = list2.getYear();
		
		list2.setTrack("2�� track");
		String track2 = list2.getTrack();
		
		list2.showInfo();
		
		//3 ��ü
		
		Song list3 = new Song();
		
		list3.setTitle("���ɿ���");
		String title3 = list3.getTitle();
		
		list3.setArtist("����Ŀ����Ŀ");
		String artist3 = list3.getArtist();
		
		list3.setAlbum("����Ŀ����Ŀ1��");
		String album3 = list3.getAlbum();
		
		list3.setComposer("����� �۰�");
		String composer3 = list3.getComposer();
		
		list3.setYear(2012);
		int year3 = list3.getYear();
		
		list3.setTrack("4�� track");
		String track3 = list3.getTrack();
		
		list3.showInfo();
		

	}

}
