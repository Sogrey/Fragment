package com.hans.fragment;

import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

public class MainTabActivity extends Activity {
	private TabHost mHost;
	LocalActivityManager lam;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mHost = (TabHost) findViewById(android.R.id.tabhost);
        lam = new LocalActivityManager(MainTabActivity.this, false);
       	lam.dispatchCreate(savedInstanceState);
        
    	mHost.setup(lam);
    	mHost.addTab(mHost.newTabSpec("Tab1").setIndicator("Tab1").setContent(new Intent(MainTabActivity.this, FragmentActivity1.class)));
    	mHost.addTab(mHost.newTabSpec("Tab2").setIndicator("Tab2").setContent(new Intent(MainTabActivity.this, FragmentActivity2.class)));
    }
    @Override
    protected void onPause() {
        lam.dispatchPause(isFinishing());
        super.onPause();
    }
    @Override
    protected void onResume() {
        lam.dispatchResume();
        super.onResume();
    }
}