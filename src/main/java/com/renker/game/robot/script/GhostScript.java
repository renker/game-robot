package com.renker.game.robot.script;

import java.awt.AWTException;

import com.renker.game.compare.model.Point;

public class GhostScript extends AbstractScript {

	public GhostScript() throws AWTException {
		super();
	}

	@Override
	public void run() {
		mouseMove(origin);
		mouseLeftClick();
		this.delay(2000);
		
		mouseMove(task);
		this.delay(2000);
		int x = task.getX();
		int y = task.getY()+37;
		mouseMove(new Point(x, y));
		mouseLeftClick();
	}
	
	public static void main(String[] args) {
		try {
			GhostScript gs;
			gs = new GhostScript();
			gs.run();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
