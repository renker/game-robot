package com.renker.game.robot;

import java.awt.AWTException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.renker.game.compare.model.Point;
import com.renker.game.robot.account.Account;

/**
 * 账号
 * @author Chen
 *
 */
public class AbstractAccount extends EventRobot implements Account{

	private Logger log = LoggerFactory.getLogger(AbstractAccount.class);
	
	/** 原始点 */
	private Point origin;
	
	public AbstractAccount() throws AWTException {
		super();
	}
	
	public void origin(int index){
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}
