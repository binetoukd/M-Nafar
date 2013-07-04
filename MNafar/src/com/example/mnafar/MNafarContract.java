package com.example.mnafar;
import android.provider.BaseColumns;

// Describes the course DB schema
public final class MNafarContract {
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "Mnafar.db";

	public MNafarContract(){}
	
	//Defines contents of the course table
	public static abstract class MNafarTable implements BaseColumns {
		public static final String TABLE_NAME = "mnafar_table";
		public static final String COLUMN_NAME_LETTRE1 = "lettre1";
		public static final String COLUMN_NAME_LETTRE2 = "lettre2";
		public static final String COLUMN_NAME_TEXTE = "texte";
		public static final String COLUMN_NAME_ADR_IMG = "adr_img";
		public static final String COLUMN_NAME_ADR_SON_TEXTE = "adr_son_texte";
		public static final String COLUMN_NAME_ADR_DEMO = "adr_demo";
		
		public static final String SQL_CREATE_MNAFAR_TABLE =
				"CREATE TABLE " + MNafarTable.TABLE_NAME + " ("+
				MNafarTable._ID + " INTEGER PRIMARY KEY," +
				MNafarTable.COLUMN_NAME_LETTRE1 + " TEXT," +
				MNafarTable.COLUMN_NAME_LETTRE2 + " TEXT," +
				MNafarTable.COLUMN_NAME_TEXTE + " TEXT," +
				MNafarTable.COLUMN_NAME_ADR_IMG + " TEXT," +
				MNafarTable.COLUMN_NAME_ADR_SON_TEXTE + " TEXT," +
				MNafarTable.COLUMN_NAME_ADR_DEMO + " TEXT)";
						
	}
	
}
