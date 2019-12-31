package com.renker.game.script;

/**
 * 脚本
 * @author Chen
 *
 */
public interface Script {
	
	/**
	 * 攻击
	 */
	public void attack();
	/**
	 * 防御
	 */
	public void defense();
	/**
	 * 治疗
	 */
	public void cure();
	
	/**
	 * 复活
	 */
	public void rescue();
	
	
	public enum Type{
		/** 活跃 */
		AC,
		/** 师门 */
		SM,
		/** 封妖 */
		FY
	}
	
}
