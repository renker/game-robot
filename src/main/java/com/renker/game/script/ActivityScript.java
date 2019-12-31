package com.renker.game.script;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.renker.game.utils.RandomUtils;

public class ActivityScript extends AbstractScript {
	
	private Logger log = LoggerFactory.getLogger(ActivityScript.class);
	
	@Override
	public void run() {
		log.debug("ActivityScript 开始执行 >>>>>>>");
		boolean flag = true;
		while (flag) {
			try {
				Thread.sleep(RandomUtils.stepDelay());
				log.debug("执行--------------");
			} catch (InterruptedException e) {
				log.error("",e);
			}
		}
	}
	
}
