package com.renker.game.ocr;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class OcrTest {
	public static void main(String[] args) {
		File file = new File("D:/icon/2.png");
		
		ITesseract instance = new Tesseract();
		instance.setDatapath("E:/ocr/tessdata");
		instance.setLanguage("chi_sim");
		
		try {
			String res = instance.doOCR(file);
			System.out.println(res);
		} catch (TesseractException e) {
			e.printStackTrace();
		}
	}
}
