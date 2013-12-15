package com.projects.veganchef;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	//Activity life cycle
	@Override
	public void onStart() {
		
		super.onStart();
	}
	
	@Override
	public void onResume() {
		
		super.onResume();
	}
	
	//Activity is visible and being used
	
	@Override
	public void onPause() {
		
		super.onPause();
	}
	
	@Override
	public void onStop() {
		
		super.onStop();
	}
	
	@Override
	public void onDestroy() {
		
		super.onDestroy();
	}

}
