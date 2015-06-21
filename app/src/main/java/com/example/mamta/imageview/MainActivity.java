package com.example.mamta.imageview;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void Next(View view) {
		count = count + 1;
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setEnabled(true);
		if (count <= 9) {

			Resources resources = getResources();
			int resourceID = resources.getIdentifier("image" + count, "drawable", getPackageName());
			ImageView image = (ImageView) findViewById(R.id.imageView);
			image.setImageResource(resourceID);
			int restringID = resources.getIdentifier("string" + count, "string", getPackageName());
			TextView textView = (TextView) findViewById(R.id.textView);
			textView.setText(restringID);

		}
		if (count == 9) {
			Button button = (Button) findViewById(R.id.button);
			button.setEnabled(false);
		}

	}

	public void Previous(View view){
		count = count - 1;
		Button button = (Button) findViewById(R.id.button);
		button.setEnabled(true);
		if (count >= 0 ) {

			Resources resources = getResources();
			int resourceID = resources.getIdentifier("image" + count, "drawable", getPackageName());
			ImageView image = (ImageView) findViewById(R.id.imageView);
			image.setImageResource(resourceID);
			int restringID = resources.getIdentifier("string" + count, "string", getPackageName());
			TextView textView = (TextView) findViewById(R.id.textView);
			textView.setText(restringID);
		}
		if (count == 0) {
			Button button1 = (Button) findViewById(R.id.button1);
			button1.setEnabled(false);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
