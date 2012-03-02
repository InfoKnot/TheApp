package com.app.user.loginservice;

import com.app.user.User;
import com.app.user.UserType;

public class MockLoginImpl implements ILoginService {

	@Override
	public User LoginUser(String username, String password) {
		if(username.equals("MasterKey") && password.equals("InfoKnot"))
		{
			return new User(UserType.DEBUG, "MasterKey", "1234567890", "test@testing.com");
		}
		return null;
	}

	@Override
	public void UpdateUser(User update) 
	{
			
	}

	@Override
	public void LogoutUser() 
	{
			
	}

}
