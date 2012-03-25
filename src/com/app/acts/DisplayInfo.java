package com.app.acts;

import java.util.HashMap;
import java.util.Map;

public class DisplayInfo 
{
	public static final String USERLEVEL = "userlevel";
	public static final String ICON = "icon";
	public static final String DISPLAYNAME = "displayname";
	public static final String CLASSPAKAGE = "classpakage";
	public static final String CLASSNAME = "classname";
	
	private Map displayInfo;
	
	public DisplayInfo()
	{
		displayInfo = new HashMap();
	}
	
	public Object Get(String key)
	{
		return displayInfo.get(key);
	}
	
	public void Put(String key, Object value)
	{
		displayInfo.put(key, value);
	}
	
	public void Reset()
	{
		displayInfo.clear();
	}
}
