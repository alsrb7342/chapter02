package com.javaex.ex07;

public class Song {
	
	//�ʵ� 6��
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//������ 0
	public Song() {
		
	}
	
	//������ 2 : Ÿ��Ʋ ��Ƽ��Ʈ
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	//������ 2 : Ÿ��Ʋ Ʈ����ȣ --> Ȯ��
	
	public Song(String title, int track) {
		this.title = title;
			
	    if(track < 5) {//������ ������ ���� ���ִ�.
		    this.track = 0;
		}
		else {
		    this.track = track;
		}
	        
		this.track = track;
		
		System.out.println("������(2)");
	}
	
	
	

	//������ 6
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, track); //�ٸ� �����ڸ� ȣ���Ѵ�.(����Ѵ�.)
		
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.println("������(6)");
	
	}
	
	
	//������ 2 : Ÿ��Ʋ �۰ --> Ȯ�� �ȵ�
	
	/*public Song(String title, String composer) {
		this.title = title;
		this.composer = composer;
	}*/
	
	
	
	
	//�޼ҵ� - getter setter
	
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

	//�޼ҵ� - �Ϲݸ޼ҵ� toString() <--�׽�Ʈ
	public String toString() {
		return title + artist + album + composer + year + track;
	}

	
	//�޼ҵ� - �Ϲݸ޼ҵ� showInfo()
	public void draw() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + "�� track, " + composer + " �۰� )");
	}
	
	
	


}
