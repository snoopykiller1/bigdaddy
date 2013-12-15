package com.projects.veganchef;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater mi = getMenuInflater();
		mi.inflate(R.menu.main_menu, menu);
		return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

		case R.id.item1:
			Intent intent1 = new Intent(this, Rezeptsuche.class);
			startActivity(intent1);
			return true;
		case R.id.item2:
			Intent intent2 = new Intent(this, Rezeptsuche.class);
			startActivity(intent2);
			return true;
		case R.id.item3:
			Intent intent3 = new Intent(this, Rezeptsuche.class);
			startActivity(intent3);
			return true;
		case R.id.item4:
			Intent intent4 = new Intent(this, Rezeptsuche.class);
			startActivity(intent4);
			return true;

		default:
			return false;
		}
	}

}
