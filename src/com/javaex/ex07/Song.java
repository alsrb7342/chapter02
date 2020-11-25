package com.javaex.ex07;

public class Song {
	
	//필드 6개
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자 0
	public Song() {
		
	}
	
	//생성자 2 : 타이틀 아티스트
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//생성자 2 : 타이틀 트랙번호 --> 확인
	
	public Song(String title, int track) {
		this.title = title;
			
	    if(track < 5) {//복잡한 로직이 있을 수있다.
		    this.track = 0;
		}
		else {
		    this.track = track;
		}
	        
		this.track = track;
		
		System.out.println("생성자(2)");
	}
	
	
	

	//생성자 6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, track); //다른 생성자를 호출한다.(사용한다.)
		
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.println("생성자(6)");
	
	}
	
	
	//생성자 2 : 타이틀 작곡가 --> 확인 안됨
	
	/*public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}*/
	
	
	
	
	//메소드 - getter setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	//메소드 - 일반메소드 toString() <--테스트
	public String toString() {
		return title + artist + album + composer + year + track;
	}

	
	//메소드 - 일반메소드 showInfo()
	public void draw() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}
	
	
	


}
