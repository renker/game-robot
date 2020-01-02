package com.renker.game.robot.script;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.renker.game.compare.model.Point;

public class ActivityScript extends AbstractScript {
	
	private Logger log = LoggerFactory.getLogger(ActivityScript.class);
	
	public ActivityScript() throws AWTException {
		super();
	}

	@Override
	public void run() {
		log.debug("script 启动  -------------------------------------------");
		long startTime = System.currentTimeMillis();
		
		List<Point> pontList = new ArrayList<Point>();
		
		pontList.add(new Point((int) (origin.getX()+780*0.25), (int) (origin.getY()+600*0.25)));
		
		pontList.add(new Point((int) (origin.getX()+780*0.25), (int) (origin.getY()+600*0.75)));
		
		pontList.add(new Point((int) (origin.getX()+780*0.75), (int) (origin.getY()+600*0.25)));
		
		pontList.add(new Point((int) (origin.getX()+780*0.75), (int) (origin.getY()+600*0.75)));
		
		int i = 0;
		boolean flag = true;
		while (flag) {
			int index = i%pontList.size();
			mouseMove(pontList.get(index));
			mouseLeftClick();
			i++;
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		log.debug("script 停止  -------------------------------------------");
	}
	
	public static void main(String[] args) {
		ActivityScript ac;
		try {
			ac = new ActivityScript();
			ac.run();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
