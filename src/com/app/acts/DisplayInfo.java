package com.app.acts;

import java.util.HashMap;
import java.util.Map;

public class DisplayInfo 
{
	public final String USERLEVEL = "userlevel";
	public final String ICON = "icon";
	public final String DISPLAYNAME = "displayname";
	public final String CLASSPAKAGE = "classpakage";
	public final String CLASSNAME = "classname";
	
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
