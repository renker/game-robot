package com.renker.game.robot;

import com.renker.game.script.Script.Type;

public interface Account {
	
	public void start(Type scriptType);
	
	public void stop();
	
}
