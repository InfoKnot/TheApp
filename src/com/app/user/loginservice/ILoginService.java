package com.app.user.loginservice;

import com.app.user.User;

/**
 * Login services are in charge of comunicating personal data with the appropriate server.
 * @author Devin Kelly-Collins
 */
public interface ILoginService 
{
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User LoginUser(String username, String password);
	
	/**
	 * 
	 * @param update
	 */
	public void UpdateUser(User update);
	
	/**
	 * 
	 */
	public void LogoutUser();
}
