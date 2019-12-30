package com.renker.game.utils;

import java.util.Random;

public class RandomUtils {
	
	/**
	   * 点击事件延迟
	 * @return
	 */
	public static int delay() {
		int start = 15;
		int end = 200;
		Random random = new Random();
		int delay = start + random.nextInt(end-15);
		return delay;
	}
	
	public static int mouseMoveDelay() {
		int start = 200;
		int end = 2000;
		Random random = new Random();
		int delay = start + random.nextInt(end-15);
		return delay;
	}
	
	/**
	   * 步骤延迟
	 * @return
	 */
	public static int stepDelay() {
		int start = 500;
		int end = 2000;
		Random random = new Random();
		int delay = start + random.nextInt(end-15);
		return delay;
	}
}
