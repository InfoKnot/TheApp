package com.app;

import java.util.List;

import com.app.acts.AppActManager;
import com.app.acts.DisplayInfo;
import com.app.user.UserType;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TheAppAct extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Start login attempt.
        
        //Try to update the app.
        
        //Get the Acts user has access to. 
        //List<DisplayInfo> userActs = AppActManaget.instance.GetDisplayInfo(User.LoggedUser.GetUserType());
        List<DisplayInfo> userActs = AppActManager.instance.GetDisplayInfo(UserType.DEBUG);
        
        //Create and Set List Adapter and set the Picture and Title.
        setListAdapter(new ArrayAdapter<DisplayInfo>(this, R.layout.main_listitem, userActs));
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        //Set click ClickListener
        lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos, long referenceId) {
				Intent intent = new Intent();
				intent.setClassName(
						userActs.get(pos).Get(DisplayInfo.CLASSPAKAGE),
						userActs.get(pos).Get(DisplayInfo.CLASSNAME));
				startActivity(intent);
			}
        }
        
        //Set header.
        lv.setHeader(R.layout.main_header);
    }
}