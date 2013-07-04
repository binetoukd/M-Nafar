package com.example.mnafar;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;

public class MNafarAdapter extends SimpleCursorAdapter {
	private static final String[] FROM = {
		MNafarContract.MNafarTable.COLUMN_NAME_LETTRE1,
		MNafarContract.MNafarTable.COLUMN_NAME_LETTRE2,
		MNafarContract.MNafarTable.COLUMN_NAME_TEXTE,
		MNafarContract.MNafarTable.COLUMN_NAME_ADR_IMG,
		MNafarContract.MNafarTable.COLUMN_NAME_ADR_SON_TEXTE,
		MNafarContract.MNafarTable.COLUMN_NAME_ADR_DEMO};
	private static final int[] TO = {
		R.id.lettre1,
		R.id.lettre2,
		R.id.texte,
		R.id.imag,
		R.id.son_texte,
		R.id.demo};
		
	public MNafarAdapter(Context context, Cursor c) {
		super(context, R.layout.activity_mnafar_list_cours, c, FROM, TO, 0);
	}
	

}
