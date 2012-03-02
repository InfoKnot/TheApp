package com.app;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.app.R;
import com.app.acts.AppAct;
import com.app.user.User;

public class LoginAct extends Activity implements AppAct
{
	private static User _user;

	public static User GetUser()
	{
		if(_user == null)
			return new User(OFFILINE);

		return _user;
	}

	private User getCachedUser()
	{
		return null;
		//Look on the device for a cached user
	}
	
	@Override
	public void onCreate()
	{
		_user = getCachedUser();
		if(_user != null) //We found a user.
			finish(); //or return;

		Button loginButton = (Button) findViewById(R.id.loginButton);
		loginButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v)
			{
				String userName = findViewById(R.id.userName).ToString(); //Grab username now.
				String password = findViewById(R.id.password).ToString();//Grab password now.
				if(userName.Equals("MasterKey") && password.Equals("42"))
				{
					//Create and return user.
				}
			}
		});

		Button offlineButton = (Button) findViewById(R.id.offlineButton);
		offlineButtton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v)
			{
				//Return offline user.
			}
		});
	}

	@Override
	public onActivityResult(int requestCode, int resultCode, Intent data)
	{
		//Check what activity finished.
		setResults(RESULT_OK);
		finish();
	}
}
