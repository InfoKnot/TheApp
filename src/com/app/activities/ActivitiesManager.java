package com.app.activities;

import java.util.ArrayList;
import java.util.List;

import android.widget.Button;

import com.app.user.UserType;

public class ActivitiesManager {
	public static ActivitiesManager INSTANCE = new ActivitiesManager();
	
	private ActivitiesManager()
	{
		
	}
	
	public List<Button> GetActivityButtons(UserType userType)
	{
		List<Button> list = new ArrayList();
		/*
		 * if(activityclass.USERLEVEL >= userType)
		 *     list.add(activityclass.GetButton());
		 */
		return list;
	}
	
	public Activity GetActivity(String uid)
	{
		return null;
		/*
		 * if(activityclass.UID.equals uid)
		 *     return new activityclass();
		 */
		
	}
}
