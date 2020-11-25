package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	//제목 읽기
	public void setTitle(String title) {
		this.title = title;
	}
	
	//제목 등록
	public String getTitle() {
		return title;
	}
	
	//가수 읽기
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//가수 등록
	public String getArtist() {
		return artist;
	}
	
	//앨범 읽기
	public void setAlbum(String album) {
		this.album = album;
	}
	
	//앨범 등록
	public String getAlbum(){
		return album;
	}
	
	//작곡가 읽기
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	//작곡가 등록
	public String getComposer(){
		return composer;
	}
	
	//연도 읽기
	public void setYear(int year) {
		this.year = year;
	}
	
	//연도 등록
	public int getYear(){
		return year;
	}
	
	//트랙 번호 읽기
	public void setTrack(String track) {
		this.track = track;
	}
	
	//트랙 번호 등록
	public String getTrack(){
		return track;
	}
	
	//전체 출력
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + ", " + composer + " )");
	}

}
