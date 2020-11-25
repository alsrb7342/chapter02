package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//���� �б�
	public void setTitle(String title) {
		this.title = title;
	}
	
	//���� ���
	public String getTitle() {
		return title;
	}
	
	//���� �б�
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//���� ���
	public String getArtist() {
		return artist;
	}
	
	//�ٹ� �б�
	public void setAlbum(String album) {
		this.album = album;
	}
	
	//�ٹ� ���
	public String getAlbum(){
		return album;
	}
	
	//�۰ �б�
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	//�۰ ���
	public String getComposer(){
		return composer;
	}
	
	//���� �б�
	public void setYear(int year) {
		this.year = year;
	}
	
	//���� ���
	public int getYear(){
		return year;
	}
	
	//Ʈ�� ��ȣ �б�
	public void setTrack(String track) {
		this.track = track;
	}
	
	//Ʈ�� ��ȣ ���
	public String getTrack(){
		return track;
	}
	
	//��ü ���
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + ", " + composer + " )");
	}

}
