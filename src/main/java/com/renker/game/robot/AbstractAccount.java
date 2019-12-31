package com.renker.game.robot;

import java.awt.AWTException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.renker.game.compare.Point;
import com.renker.game.script.ActivityScript;
import com.renker.game.script.Script;
import com.renker.game.script.Script.Type;

/**
 * 账号
 * @author Chen
 *
 */
public class AbstractAccount extends EventRobot implements Account{
	public AbstractAccount() throws AWTException {
		super();
	}


	private Logger log = LoggerFactory.getLogger(AbstractAccount.class);
	
	/** 原始点 */
	private Point origin;
	
	
	/** 脚本 */
//	private static Map<String, Script> scriptMap = new LinkedHashMap<String, Script>();
	
//	static {
//		scriptMap.put(Script.Type.AC.toString(), new ActivityScript());
//	}
	

	@Override
	public void start(Type scriptType) {
		log.debug("启动脚本 ===>"+scriptType.toString());
		Script script = new ActivityScript();
		script.run();
	}

	@Override
	public void stop() {
		log.debug("停止脚本");
	}
	
}
