package com.app.acts;

import java.util.ArrayList;
import java.util.List;

import com.app.acts.promanager.ProManagerAct;
import com.app.user.UserType;

public class AppActManager
{
	public static AppActManager instance = new AppActManager();
	
	private List<Object> _actList;
	
	private AppActManager()
	{
		_actList = new ArrayList<Object>();
	}
	
	public List<DisplayInfo> GetDisplayInfo(UserType accessLevel)
	{
		return null;
	}
}
