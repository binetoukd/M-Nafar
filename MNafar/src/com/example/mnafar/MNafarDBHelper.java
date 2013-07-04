package com.example.mnafar;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class MNafarDBHelper extends SQLiteOpenHelper {


	public MNafarDBHelper(Context context) {
		super(context, MNafarContract.DATABASE_NAME, null, MNafarContract.DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(MNafarContract.MNafarTable.SQL_CREATE_MNAFAR_TABLE);
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


	}

