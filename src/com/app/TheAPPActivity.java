package com.app;

import java.util.ArrayList;
import java.util.List;

import com.app.user.User;
import com.app.user.UserType;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Button;
import android.widget.TextView;

public class TheAPPActivity extends Activity {
	
	private User _mainUser;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ScrollView sv = new ScrollView(this);
        TableLayout tl = new TableLayout(this);
        tl.setOrientation(TableLayout.VERTICAL);
        sv.addView(tl);
        
        if(login()) //Login success.
        {
        	//TODO: Create header view;
        	TableRow headerView = new TableRow(null);
        	TextView headerText = new TextView(null);
        	headerText.setBackgroundColor(Color.GRAY);
        	headerText.setText(
        			"Name: " + _mainUser.getName() + "\n" +
        			"Phone Number: " + _mainUser.getPhoneNumber() +"\n" +
        			"Email: " + _mainUser.getEmail() +"\n" +
        			"Position: " + _mainUser.getUserType().toString(),
        			TextView.BufferType.NORMAL);
        	headerView.addView(headerText);
        	//TODO: add onClick - goto Profile management.
        	tl.addView(headerView);
        	
        	//TODO: foreach IActivity in _activityList create a new button
        	// and add it to tl.
        }
        else //Login failed
        {
        	//IDK, try again?
        }
        setContentView(sv);
    }
    
    private boolean login() {
    	//TODO: handle user login.
    	_mainUser = new User(UserType.RA, "TestDummy", "(999) 999-9999", "testDummy@yahoo.com");
    	return true;
    }
}