package com.renker.game.compareimage;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;

import com.renker.game.robot.GameRobot;

public class MainInTest {
	public static void main(String[] args) {
		String src = "D:/screenImage/source.png";
		String target = "D:/screenImage/part2.png";
		long start = System.currentTimeMillis();
		ResultBean result = null;
		try {
			SearchPixelPosition searchPixelPosition = new SearchPixelPosition();
			result = searchPixelPosition.getAllRGB(src, target);
			if (result != null) {
				SnippingImage.saveImageWithSize(result.x, result.y, result.width, result.height, src,
						"D:/screenImage/compare-ai.png");
				ImagePHash p = new ImagePHash();
				System.out.println("进行相似度计算");
				String image1 = p.getHash(new FileInputStream(new File(target)));
				String image2 = p.getHash(new FileInputStream(new File("D:/screenImage/compare-ai.png")));
				System.out.println("相似度为" + (p.distance(image1, image2)==0?"相似度100%":"不相似"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("总共耗时：" + (end - start));
		
		try {
			GameRobot robot = new GameRobot();
			robot.mouseMove(result.x+result.width/2, result.y+result.height/2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
