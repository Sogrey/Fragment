package com.hans.fragment;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.TextView;

public class AboutActivity extends Activity {
	TextView tv;
	String fulltext = "";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}
	private int[] getPos(String keyword){
		int[] result = new int[2];
		result[0] = fulltext.indexOf(keyword);
		result[1] = result[0] + keyword.length();
		return result;
	}
}
