package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ 0
		Song s01 = new Song();
		
		s01.setTitle("������");
		s01.setArtist("������");
		s01.setAlbum("Real");
		s01.setComposer("�̹μ�");
		s01.setYear("2010");
		s01.setTrack(3);
		
		s01.draw();
		
		
		//������ 6
		Song s02 = new Song("������", "BIGBANG", "Always", "G-DRAGON", "2007", 2);
		
		s02.draw();
		
		//������ 2 Ÿ��Ʋ, ��Ƽ��Ʈ
		Song s03 = new Song("���ɿ���", "����Ŀ����Ŀ");
		
		s03.setAlbum("����Ŀ����Ŀ1��");
		s03.setComposer("�����");
		s03.setYear("2012");
		s03.setTrack(4);
		
		s03.draw();
		
		//������ 2 Ÿ��Ʋ, Ʈ��
		Song s04 = new Song("DINOSAUR", 1);
		
		s04.setArtist("�ǵ�������");
		s04.setAlbum("SUMMER EPISODE");
		s04.setComposer("������");
		s04.setYear("2017");
		
		s04.draw();
		//System.out.println(p01.toString());
		

	}

}
