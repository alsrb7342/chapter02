package com.javaex.ex001;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	//전체
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//파워 on
	public void power(boolean on) {
		if(on == true) {
			this.power = on;
		}
		else {
			this.power = power;
		}
	}
	//파워 off
	public void power1(boolean off) {
		if(off == false) {
			this.power = off;
		}
		else {
			this.power = power;
		}
	}
	
	//볼륨관련 (0~100)
	public void volume(int volume) {
		if(power == true) {
			if(volume < 1) {
				this.volume = 0;
			}
			else if(volume >= 100) {
				this.volume = 100;
			}
			else {
				this.volume = volume;
			}
		}
	}
	
	//볼륨 up
	public void volumeup(boolean up) {
		if(up == true) {
			this.volume = volume + 1;
		}
		else {
			this.volume = volume;
		}
	}
	
	//볼륨 down
	public void volumeoff(boolean off) {
		if(off == false) {
			this.volume = volume - 1;
		}
		else {
			this.volume = volume;
		}
	}
	
	//채널 (1~255)
	public void 
	
	

}
