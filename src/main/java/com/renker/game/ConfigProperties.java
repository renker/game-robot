package com.renker.game;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix="sample")
@EnableConfigurationProperties
public class ConfigProperties {
	
	/** 源点图标 */
	private String origin = "D:/icon/origin.png";
	
	/** 任务图标 */
	private String task = "D:/icon/task.png";
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
}
