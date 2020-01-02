package com.renker.game;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationProperties(prefix="fairyland.security.token")
@EnableConfigurationProperties
public class ConfigProperties {
	private String originIcon;

	public String getOriginIcon() {
		return originIcon;
	}

	public void setOriginIcon(String originIcon) {
		this.originIcon = originIcon;
	}
}
