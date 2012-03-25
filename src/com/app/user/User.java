package com.app.user;

import com.app.user.loginservice.ILoginService;
import com.app.user.loginservice.MockLoginImpl;

/**
 * 
 * @author Devin Kelly-Collins
 */
public class User {
	private UserType _userType;
	private String _name;
	private String _phone;
	private String _email;
	
	public static User LoggedUser = null;
	
	public static User LoginUser(String username, String password) throws Exception
	{
		if(LoggedUser != null)
			throw new Exception("LoggedUser != null, must log out current user.");
		
		ILoginService loginService = new MockLoginImpl();
		LoggedUser = loginService.LoginUser(username, password);
		return LoggedUser;
	}
	
	public static void LogoutUser() throws Exception
	{
		if(LoggedUser == null)
			throw new Exception("LoggedUser == null, no user to log out");
		
		ILoginService loginService = new MockLoginImpl();
		loginService.LogoutUser();
		LoggedUser = null;
	}
	
	public User(){
		_userType = null;
		_name = null;
		_phone = null;
		_email = null;
	}
	
	public User(UserType userType, String name, String phone, String email){
		_userType = userType;
		_name = name;
		_phone = phone;
		_email = email;
	}
	
	public User(User u)
	{
		_userType = u.getUserType();
		_name = u.getName();
		_phone = u.getPhoneNumber();
		_email = u.getEmail();
	}

	public void setUserType(UserType userType) {
		this._userType = userType;
	}

	public UserType getUserType() {
		return _userType;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getName() {
		return _name;
	}

	public void setPhoneNumber(String phone) {
		this._phone = phone;
	}

	public String getPhoneNumber() {
		return _phone;
	}

	public void setEmail(String email) {
		this._email = email;
	}
	
	public String getEmail() {
		return _email;
	}
	
	public boolean HasAccess(UserType curType) {
		/*
		 * -1 should mean the user does not have access.
		 * Ex: _userType = Student
		 *     curType = Employee 
		 *     User does not have access.
		 * 0 means the types are the same so the user does have access. 
		 * Ex: _userType = curType = Student
		 * 1 means user does have access.
		 * Ex: _userType = Student
		 *     curType = NonStudent
		 *     User does have access.
		 */
		return _userType.compareTo(curType) >= 0;		
	}
}
