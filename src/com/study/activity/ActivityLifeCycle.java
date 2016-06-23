package com.study.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.study.R;
import com.study.activity.DialogActivity;
import com.study.activity.ActivityLifeCycle;
import com.study.activity.NormalActivity;

public class ActivityLifeCycle extends Activity {
	public static final String LOG_TAG = "ActivityLifeCycle";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_layout);
		Log.d(LOG_TAG, "onCreate");
		Button button1 = (Button)findViewById(R.id.btn_start_normal_activity);
		button1.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityLifeCycle.this, NormalActivity.class);
				startActivity(intent);
			}
		});
		
		Button button2 = (Button)findViewById(R.id.btn_start_dialog_activity);
		button2.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ActivityLifeCycle.this, DialogActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(LOG_TAG, "onStart");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(LOG_TAG, "onResume");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(LOG_TAG, "onPause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(LOG_TAG, "onStop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(LOG_TAG, "onDestroy");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(LOG_TAG, "onRestart");
	}
}
