package com.renker.game.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageUtils2 {
	public static void binary(String sourcePath, String savePath) throws IOException{
		BufferedImage image = ImageIO.read(new File(sourcePath));
		
		int width = image.getWidth();
		int height = image.getHeight();
		
		BufferedImage binaryImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_BINARY);//重点，技巧在这个参数BufferedImage.TYPE_BYTE_BINARY
		for(int i= 0 ; i < width ; i++){
		    for(int j = 0 ; j < height; j++){
			int rgb = image.getRGB(i, j);
			binaryImage.setRGB(i, j, rgb);
		    }
		}
		
		File newFile = new File(savePath);
		ImageIO.write(binaryImage, "png", newFile);
	}
	
	public static void gray(String sourcePath, String savePath) throws IOException{
		BufferedImage image = ImageIO.read(new File(sourcePath));
		
		int width = image.getWidth();
		int height = image.getHeight();
		
		BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);//重点，技巧在这个参数BufferedImage.TYPE_BYTE_BINARY
		for(int i= 0 ; i < width ; i++){
		    for(int j = 0 ; j < height; j++){
			int rgb = image.getRGB(i, j);
			grayImage.setRGB(i, j, rgb);
		    }
		}
		
		File newFile = new File(savePath);
		ImageIO.write(grayImage, "png", newFile);
	}
	
	public static BufferedImage gray(BufferedImage image) {
		try {
			int width = image.getWidth();
			int height = image.getHeight();
			
			BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);//重点，技巧在这个参数BufferedImage.TYPE_BYTE_BINARY
			for(int i= 0 ; i < width ; i++){
			    for(int j = 0 ; j < height; j++){
					int rgb = image.getRGB(i, j);
					grayImage.setRGB(i, j, rgb);
			    }
			}
			return grayImage;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		try {
			gray("D:/screenImage/gray.png", "D:/screenImage/test2-result-gray.png");
			binary("D:/screenImage/gray.png", "D:/screenImage/test2-result-binary.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
