package com.app;

import com.app.user.UserType;

import android.app.Activity;
import android.os.Bundle;

public class TheAppAct extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        List<DisplayInfo> = AppActManager.instance.GetDisplayInfo(UserType.DEBUG);
        
        setListAdapter(new ArrayAdapter<String>(this, R.layout.main_listitem, userActs));
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {}
          
        lv.setHeader(R.layout.main_header);
    }
}