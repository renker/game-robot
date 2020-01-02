package com.renker.game.compare.model;

import java.util.List;

/**
 * 指纹
 * @author renker
 * @date 2019年12月24日
 */
public class Fingerprint {
	private int width;
	private int height;
	/** 指纹点集合 */
	private List<Position> positions;
	
	public Fingerprint() {
	}
	
	public Fingerprint(List<Position> positions) {
		this.positions = positions;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Fingerprint fingerprint) {
		
		return this.positions.equals(fingerprint.getPositions());
	}
}
