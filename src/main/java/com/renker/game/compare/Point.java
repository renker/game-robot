package com.renker.game.compare;

public class Point {
	private int x;
	private int y;
	
	private int width;
	private int height;
	
	public Point() {
		super();
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y,int with,int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = with;
		this.height = height;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Point center(){
		return new Point(x+width/2,y+height/2);
	}
	
}
