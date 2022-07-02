package com.rk;

public class Fan {
	
	//State or fields
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	//Creation or constructor
	public Fan(String make,double radius,String color) {
		this.make=make;
		this.radius=radius;
		this.color=color;
	}
	
	// print the state
	public String toString() {
		return String.format("make - %s, radius - %f , color - %s , isOn - %b , speed - %d ",
				make,radius,color,isOn,speed);
	}
	
}
