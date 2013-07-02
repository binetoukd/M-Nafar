package com.example.calculatrice;


import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	String n = "";
	
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
	public void digitClick(View v){
		Button b = (Button) v;
		
		Log.d("Calcul", "Chiffre="+ b.getText());
		n += b.getText();
		Log.d("Calcul", "n="+ n);
	}
	
	public void opClick(View v) {
		int i = Integer.parseInt(n);
		Log.d("Calcul", "n="+ i);
		Log.d("Calcul", "n-2="+ (i-2));
	}

}
