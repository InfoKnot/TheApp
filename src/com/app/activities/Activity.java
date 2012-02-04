package com.app.activities;

import com.app.user.UserType;

import android.text.Layout;
import android.widget.Button;

/**
 * Interface for a generic activiy in the APP
 * @author owner
 *
 */
public abstract class Activity {
	public static String UID;
	public static UserType USERLEVEL;
	public static abstract Button GetButton();
}
