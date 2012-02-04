package com.app.user;

/**
 * 
 * List is sorted by access levels.
 * Ex: Debug has a higher access level then RA So debug can access RA and up level activities.
 * @author owner
 *
 */
public enum UserType {
	//God mode.
	DEBUG,
	//For RLC or ARLC.
	COORDINATER,
	//RA's obviously.
	RA,
	//Student Living in the dorms.
	RESIDENT,
	//Student of K-State but not in the dorms.
	STUDENT,
	//Not a student. Shouldnt even need to login for this one.
	NONSTUDENT
}
