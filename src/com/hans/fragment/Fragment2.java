package com.hans.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_2, container, false);
		/*
        Button tv = (Button)v.findViewById(R.id.button2);
        tv.setText("Fragment 2");
        tv.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				FragmentActivity1.changeFragment(new Fragment2());
			}
		});
        return v;
        */
		return v;
	}
}
