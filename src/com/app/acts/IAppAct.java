package com.app.acts;

import com.app.user.UserType;

/**
 * Parent class for all other activities in the app.
 * @author owner
 *
 */
public interface IAppAct 
{	
	/**
	 * Returns the button to be displayed to access the act.
	 */
	public DisplayInfo GetDisplyInfo();
}