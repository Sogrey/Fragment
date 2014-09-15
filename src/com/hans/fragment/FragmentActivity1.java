package com.hans.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FragmentActivity1 extends FragmentActivity {
	public static FragmentManager fm;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_activity_1);
		fm = getSupportFragmentManager();
		initFragment(new Fragment1());
	}
	public static void changeFragment(Fragment f){
		changeFragment(f, false);
	}
	public static void initFragment(Fragment f){
		changeFragment(f, true);
	}
	private static void changeFragment(Fragment f, boolean init){
		FragmentTransaction ft = fm.beginTransaction();
		ft.replace(R.id.simple_fragment, f);
		if(!init)
			ft.addToBackStack(null);
		ft.commit();
	}
}
