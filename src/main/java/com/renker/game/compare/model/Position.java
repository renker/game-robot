package com.renker.game.compare.model;

/**
 * 图片坐标信息
 * @author renker
 * @date 2019年12月24日
 */
public class Position {
	/** x 轴 */
	private int x;
	/** y 轴 */
	private int y;
	/** 色值 */
	private int rgb;
	
	public Position() {
	}
	
	public Position(int x,int y,int rgb) {
		this.x = x;
		this.y = y;
		this.rgb = rgb;
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
	public int getRgb() {
		return rgb;
	}
	public void setRgb(int rgb) {
		this.rgb = rgb;
	}
	
	@Override
	public boolean equals(Object obj) {
		Position tar = (Position) obj;
//		System.out.println(this.rgb+"########"+tar.getRgb());
		return this.rgb == tar.getRgb();
	}
}
