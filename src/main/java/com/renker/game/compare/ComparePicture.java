package com.renker.game.compare;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.renker.game.compare.model.Fingerprint;
import com.renker.game.compare.model.Point;
import com.renker.game.compare.model.Position;
import com.renker.game.utils.ImageUtils2;

/**
 * 图片比对
 * @author renker
 * @date 2019年12月24日
 */
public class ComparePicture {
	
	public Point grayMatchingPartAtPosition(BufferedImage source, BufferedImage part){
		BufferedImage source_gray = ImageUtils2.gray(source);
		BufferedImage part_gray = ImageUtils2.gray(part);
		return matching(source_gray, part_gray);
	}
	
	public Point matching(BufferedImage source, BufferedImage part){
		
		int min_x = source.getMinX();
		int min_y = source.getMinY();
		
		int max_x = source.getWidth() - part.getWidth();
		int max_y = source.getHeight() - part.getHeight();
		
		// 获取图片指纹
		Fingerprint  fingerprint=  partFingerprint(part);
		
		for (int x = min_x; x < max_x; x++) {
			for (int y = min_y ; y < max_y ; y ++) {
				Fingerprint temp = sourceFingerprint(source,part,x, y);
				if(temp.equals(fingerprint)){
					System.out.println("位置坐标 {x="+x+", y="+y+"}");
					return new Point(x,y,part.getWidth(),part.getHeight());
				}
			}
		}
		return null;
	}
	
	/**
	 * 从样例图片中获取指纹
	 * @param part
	 * @return
	 */
	private Fingerprint sourceFingerprint(BufferedImage source, BufferedImage part,int init_x,int init_y){
		List<Position> positions = new ArrayList<Position>();
		int width = part.getWidth();
		int height = part.getHeight();
		
		int x1 = (int) (width * 0.25) + init_x;
		int y1 = (int) (height * 0.25) + init_y;
		int x2 = (int) (width * 0.75) + init_x;
		int y2 = (int) (height * 0.25)  + init_y;
		int x3 = (int) (width * 0.5) + init_x;
		int y3 = (int) (height * 0.5) + init_y;
		int x4 = (int) (width * 0.25) + init_x;
		int y4 = (int) (height * 0.75) + init_y;
		int x5 = (int) (width * 0.75) + init_x;
		int y5 = (int) (height * 0.75) + init_y;
		
		positions.add(new Position(x1, y1, source.getRGB(x1, y1)));
		positions.add(new Position(x2, y2, source.getRGB(x2, y2)));
		positions.add(new Position(x3, y3, source.getRGB(x3, y3)));
		positions.add(new Position(x4, y4, source.getRGB(x4, y4)));
		positions.add(new Position(x5, y5, source.getRGB(x5, y5)));
		
		return new Fingerprint(positions);
	}
	
	/**
	 * 从样例图片中获取指纹
	 * @param part
	 * @return
	 */
	private Fingerprint partFingerprint(BufferedImage part){
		List<Position> positions = new ArrayList<Position>();
		int width = part.getWidth();
		int height = part.getHeight();
		
		int x1 = (int) (width * 0.25);
		int y1 = (int) (height * 0.25);
		int x2 = (int) (width * 0.75);
		int y2 = (int) (height * 0.25);
		int x3 = (int) (width * 0.5);
		int y3 = (int) (height * 0.5);
		int x4 = (int) (width * 0.25);
		int y4 = (int) (height * 0.75);
		int x5 = (int) (width * 0.75);
		int y5 = (int) (height * 0.75);
		
		positions.add(new Position(x1, y1, part.getRGB(x1, y1)));
		positions.add(new Position(x2, y2, part.getRGB(x2, y2)));
		positions.add(new Position(x3, y3, part.getRGB(x3, y3)));
		positions.add(new Position(x4, y4, part.getRGB(x4, y4)));
		positions.add(new Position(x5, y5, part.getRGB(x5, y5)));
		
		return new Fingerprint(positions);
	}
	
	public static void main(String[] args) {
		ComparePicture cp = new ComparePicture();
		
		try {
			cp.grayMatchingPartAtPosition(ImageIO.read(new File("D:/screenImage/source.png")), ImageIO.read(new File("D:/screenImage/part.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
