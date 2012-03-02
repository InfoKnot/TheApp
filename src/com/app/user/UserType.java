package com.app.user;

/**
 * List is sorted by access levels.
 * Ex: Debug has a higher access level then RA So debug can access RA and up level activities.
 * 
 * @author Devin Kelly-Collins
 */
public enum UserType 
{
	//God mode.
	DEBUG,
	//For Housing and dining / Faculty
	ADMIN1, ADMIN2,
	//RA's obviously.
	RA,
	//Student Living in the dorms.
	RESIDENT,
	//Student of K-State but not in the dorms.
	STUDENT,
	//Not a student. Also offline user.
	NONSTUDENT
}