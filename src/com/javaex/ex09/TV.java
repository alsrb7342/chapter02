package com.javaex.ex09;

public class TV {
	private int channel;
	private int volume;
	private String power;
	
	
	//持失切 3
	public TV(int channel, int volume, boolean power) {
		this(power);
		
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
		
	}
	
	//持失切2
	public void TV(boolean power, int volume) {
		
		this(power);
		
		this.power = power;
		this.volume = volume;
		
		if(true) {
			this.power = "on" != null;
		}
		
		else {
			this.power = "off" != null;
		}
	}
	
	//持失切1
	
	public TV(int volume) {
		this.volume = volume;
		
		if(true) {
			int sum = volume + 1;
		}
		else{
			int sum = volume - 1;
		}
	}
	
	//持失切1
	public void TV(int channel) {
		this.channel = channel;
		
		if(true) {
			int sum = channel + 1;
		}
		
		else {
			int sum = channel - 1;
		}
	}
	
	//持失切1
	public void TV(boolean power) {
		this(power);
		
		this.power = power;
	}
		
		
		
	
	//五社球 getter setter

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	//五社球 析鋼
	
	


	
	




	
}
