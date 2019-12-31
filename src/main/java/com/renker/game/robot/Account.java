package com.renker.game.robot;

import java.util.Map;

import com.renker.game.compare.Point;
import com.renker.game.script.AbstractScript;

/**
 * 账号
 * @author Chen
 *
 */
public class Account {
	/** 原始点 */
	private Point origin;
	
	/** 控制器 */
	private EventRobot robot;
	
	/** 脚本 */
	private Map<String, AbstractScript> scriptMap;
	
	/** 切换 */
	private void tab() {
		robot.mouseMove(origin);
	}
}
