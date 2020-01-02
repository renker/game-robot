package com.renker.game;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


public class SpringHolder implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext;
	
	private final static ConfigProperties configProperties = new ConfigProperties();
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringHolder.applicationContext = applicationContext;
	}
	
	
	public static HttpServletRequest getHttpServletRequest(){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static Object getBean(String name) {
		if (getApplicationContext() == null)
			return null;
		return getApplicationContext().getBean(name);
	}

	public static boolean containsBean(String name) {
		if (getApplicationContext() == null)
			return false;
		return getApplicationContext().containsBean(name);
	}

	/**
	 * 具有唯一性
	 * 
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz) {
		if (getApplicationContext() == null)
			return null;
		return getApplicationContext().getBean(clazz);
	}
	
	public static <T> T getProperties(String key,Class<T> clazz){
		if (getApplicationContext() == null)
			return null;
		return getApplicationContext().getEnvironment().getProperty(key, clazz);
	}
	
	public static <T> T getProperties(String key,Class<T> clazz,T defaultValue){
		if (getApplicationContext() == null)
			return null;
		return getApplicationContext().getEnvironment().getProperty(key, clazz, defaultValue);
	}
	
	public static ConfigProperties config(){
		// return getBean(ConfigProperties.class);
		return configProperties;
	}
	
}
