package com.javaex.ex04;

import com.javaex.ex03.Song;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song s01 = new Song();
		
		s01.setTitle("������");
		s01.setArtist("������");
		s01.setAlbum("Real");
		s01.setComposer("�̹μ� �۰�");
		s01.setYear(2010);
		s01.setTrack("3�� track");
		
		s01.showInfo();
		
		Song s02 = new Song("������", "BIGBANG", "Always", "G-DRAGON �۰�", 2007, "2�� track");
		
		s02.showInfo();
		
		/*
		s02.setTitle("������");
		s02.setArtist("BIGBANG");
		s02.setAlbum("Always");
		s02.setComposer("G-DRAGON �۰�");
		s02.setYear(2007);
		s02.setTrack("2�� track");
		
		s02.showInfo();
		
        Song s03 = new Song();
		
		s03.setTitle("����Ŀ����Ŀ");
		s03.setArtist("���ɿ���");
		s03.setAlbum("����Ŀ����Ŀ1��");
		s03.setComposer("����� �۰�");
		s03.setYear(2012);
		s03.setTrack("4�� track");
		
		s03.showInfo();
		*/
		
		
		
		

	}

}
