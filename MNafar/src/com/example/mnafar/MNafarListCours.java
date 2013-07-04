package com.example.mnafar;

import com.example.mnafar.MNafarContract.MNafarTable;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.Menu;

public class MNafarListCours extends ListActivity {
	private MNafarDBHelper dbHelper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_mnafar_list_cours);
		dbHelper = new MNafarDBHelper(this);
		
	}
	
	protected void onResume(){
		super.onResume();
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		
		Cursor source = db.query(MNafarContract.MNafarTable.TABLE_NAME, null, null, null, null, null, null);
		SimpleCursorAdapter cAdapter = new MNafarAdapter(this, source);
		setListAdapter(cAdapter);
		db.close();
	}

}
