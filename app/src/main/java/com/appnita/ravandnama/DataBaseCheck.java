package com.appnita.ravandnama;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseCheck extends SQLiteOpenHelper {

    Context context;

    private static final String DATABASE_NAME = "db_check";
    private static final int DATABASE_VERSION = 1;

    public static final String COL_ID = "col_id";
    public static final String COL_LESSON = "col_lesson";
    public static final String COL_IS_READ = "col_is_read";
    public static final String COL_IS_SUM = "col_is_sum";
    public static final String COL_IS_TEST = "col_is_test";

    private static final String FARSI_TABLE_NAME = "tbl_farsi_10";
    private static final String ARABI_TABLE_NAME = "tbl_arabi_10";
    private static final String DINI_TABLE_NAME = "tbl_dini_10";
    private static final String ZABAN_TABLE_NAME = "tbl_zaban_10";
    private static final String RIAZI_TABLE_NAME = "tbl_riazi_10";
    private static final String HENDESE_TABLE_NAME = "tbl_hendese_10";
    private static final String FIZIK_TABLE_NAME = "tbl_fizik_10";
    private static final String SHIMI_TABLE_NAME = "tbl_shimi_10";
    private static final String ZIST_TABLE_NAME = "tbl_zist_10";
    private static final String FONON_TABLE_NAME = "tbl_fonon_10";
    private static final String RIAZIE_TABLE_NAME = "tbl_riazie_10";
    private static final String TARI_TABLE_NAME = "tbl_tari_10";
    private static final String JAME_TABLE_NAME = "tbl_jame_10";
    private static final String JOGH_TABLE_NAME = "tbl_jogh_10";
    private static final String EGH_TABLE_NAME = "tbl_egh_10";
    private static final String MANT_TABLE_NAME = "tbl_mant_10";


    private static final String FARSI_TABLE_NAME_11 = "tbl_farsi_11";
    private static final String ARABI_TABLE_NAME_11 = "tbl_arabi_11";
    private static final String DINI_TABLE_NAME_11 = "tbl_dini_11";
    private static final String ZABAN_TABLE_NAME_11 = "tbl_zaban_11";
    private static final String HESAB_TABLE_NAME_11 = "tbl_riazi_11";
    private static final String HENDESE_TABLE_NAME_11 = "tbl_hendese_11";
    private static final String AMAR_TABLE_NAME_11 = "tbl_amar_11";
    private static final String FIZIK_TABLE_NAME_11 = "tbl_fizik_11";
    private static final String SHIMI_TABLE_NAME_11 = "tbl_shimi_11";
    private static final String RIAZIT_TABLE_NAME_11 = "tbl_riazit_11";
    private static final String ZIST_TABLE_NAME_11 = "tbl_zist_11";
    private static final String DINIE_TABLE_NAME_11 = "tbl_dinie_11";
    private static final String FONON_TABLE_NAME_11 = "tbl_fonon_11";
    private static final String RIAZIE_TABLE_NAME_11 = "tbl_riazie_11";
    private static final String TARI_TABLE_NAME_11 = "tbl_tari_11";
    private static final String JAME_TABLE_NAME_11 = "tbl_jame_11";
    private static final String JOGH_TABLE_NAME_11 = "tbl_jogh_11";
    private static final String RAVAN_TABLE_NAME_11 = "tbl_ravan_11";
    private static final String FALS_TABLE_NAME_11 = "tbl_fals_11";


    private static final String FARSI_TABLE_NAME_12 = "tbl_farsi_12";
    private static final String ARABI_TABLE_NAME_12 = "tbl_arabi_12";
    private static final String DINI_TABLE_NAME_12 = "tbl_dini_12";
    private static final String ZABAN_TABLE_NAME_12 = "tbl_zaban_12";
    private static final String HESAB_TABLE_NAME_12 = "tbl_hesab_12";
    private static final String HENDESE_TABLE_NAME_12 = "tbl_hendese_12";
    private static final String GOSAS_TABLE_NAME_12 = "tbl_gosas_12";
    private static final String FIZIK_TABLE_NAME_12 = "tbl_fizik_12";
    private static final String SHIMI_TABLE_NAME_12 = "tbl_shimi_12";
    private static final String RIAZIT_TABLE_NAME_12 = "tbl_riazit_12";
    private static final String ZIST_TABLE_NAME_12 = "tbl_zist_12";
    private static final String FIZIKT_TABLE_NAME_12 = "tbl_fizikt_12";
    private static final String FONON_TABLE_NAME_12 = "tbl_fonon_12";
    private static final String RIAZIE_TABLE_NAME_12 = "tbl_riazie_12";
    private static final String TARI_TABLE_NAME_12 = "tbl_tari_12";
    private static final String JAME_TABLE_NAME_12 = "tbl_jame_12";
    private static final String JOGH_TABLE_NAME_12 = "tbl_jogh_12";
    private static final String FALS_TABLE_NAME_12 = "tbl_fals_12";



    private static final String SQL_COMMOND_FARSI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + FARSI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ARABI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + ARABI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_DINI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + DINI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZABAN_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + ZABAN_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIZAI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + RIAZI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_HENDESE_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + HENDESE_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FIZIK_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + FIZIK_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_SHIMI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + SHIMI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZIST_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + ZIST_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FONON_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + FONON_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIAZIE_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + RIAZIE_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_TARI_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + TARI_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JAME_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + JAME_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JOGH_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + JOGH_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_EGH_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + EGH_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_MANT_TABLE_NAME = "CREATE TABLE IF NOT EXISTS " + MANT_TABLE_NAME + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";









    private static final String SQL_COMMOND_FARSI_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + FARSI_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ARASBI_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + ARABI_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_DINI_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + DINI_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZABAN_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + ZABAN_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_HESAB_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + HESAB_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_HENDESE_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + HENDESE_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FIZIK_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + FIZIK_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_SHIMI_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + SHIMI_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_AMAR_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + AMAR_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIAZIT_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + RIAZIT_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZIST_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + ZIST_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_DINIE_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + DINIE_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FONON_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + FONON_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIAZIE_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + RIAZIE_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_TARI_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + TARI_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JAME_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + JAME_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JOGH_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + JOGH_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RAVAN_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + RAVAN_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FALS_TABLE_NAME_11 = "CREATE TABLE IF NOT EXISTS " + FALS_TABLE_NAME_11 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";







    private static final String SQL_COMMOND_FARSI_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + FARSI_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ARASBI_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + ARABI_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_DINI_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + DINI_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZABAN_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + ZABAN_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_HESAB_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + HESAB_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_HENDESE_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + HENDESE_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FIZIK_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + FIZIK_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_SHIMI_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + SHIMI_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_GOSAS_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + GOSAS_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIAZIT_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + RIAZIT_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_ZIST_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + ZIST_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FIZIKT_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + FIZIKT_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_FONON_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + FONON_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_RIAZIE_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + RIAZIE_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_TARI_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + TARI_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JAME_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + JAME_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    private static final String SQL_COMMOND_JOGH_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + JOGH_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";


    private static final String SQL_COMMOND_FALS_TABLE_NAME_12 = "CREATE TABLE IF NOT EXISTS " + FALS_TABLE_NAME_12 + "(" +
            COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_LESSON + " INTEGER, " +
            COL_IS_READ + " INTEGER DEFAULT 0, " +
            COL_IS_SUM + " INTEGER DEFAULT 0, " +
            COL_IS_TEST + " INTEGER DEFAULT 0);";

    public DataBaseCheck(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            // --- DAHOM --- //
            db.execSQL(SQL_COMMOND_FARSI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_ARABI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_DINI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_ZABAN_TABLE_NAME);
            db.execSQL(SQL_COMMOND_RIZAI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_HENDESE_TABLE_NAME);
            db.execSQL(SQL_COMMOND_FIZIK_TABLE_NAME);
            db.execSQL(SQL_COMMOND_SHIMI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_ZIST_TABLE_NAME);
            db.execSQL(SQL_COMMOND_FONON_TABLE_NAME);
            db.execSQL(SQL_COMMOND_RIAZIE_TABLE_NAME);
            db.execSQL(SQL_COMMOND_TARI_TABLE_NAME);
            db.execSQL(SQL_COMMOND_JAME_TABLE_NAME);
            db.execSQL(SQL_COMMOND_JOGH_TABLE_NAME);
            db.execSQL(SQL_COMMOND_EGH_TABLE_NAME);
            db.execSQL(SQL_COMMOND_MANT_TABLE_NAME);

            // --- YAZDAHOM --- //
            db.execSQL(SQL_COMMOND_FARSI_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_ARASBI_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_DINI_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_ZABAN_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_HESAB_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_HENDESE_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_FIZIK_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_SHIMI_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_AMAR_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_RIAZIT_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_ZIST_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_DINIE_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_FONON_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_RIAZIE_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_TARI_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_JAME_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_JOGH_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_RAVAN_TABLE_NAME_11);
            db.execSQL(SQL_COMMOND_FALS_TABLE_NAME_11);

            // --- DAVAZDAHOM --- //
            db.execSQL(SQL_COMMOND_FARSI_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_ARASBI_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_DINI_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_ZABAN_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_HESAB_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_HENDESE_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_FIZIK_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_SHIMI_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_GOSAS_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_RIAZIT_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_ZIST_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_FIZIKT_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_FONON_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_RIAZIE_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_TARI_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_JAME_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_JOGH_TABLE_NAME_12);
            db.execSQL(SQL_COMMOND_FALS_TABLE_NAME_12);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // --- ADD LESSON -- //

    public void addlesson(LessonModel model,String name) {
        ContentValues cv = new ContentValues();
        cv.put(COL_ID, model.getId());
        cv.put(COL_LESSON, model.getLesson());
        cv.put(COL_IS_READ, model.getIsRead());
        cv.put(COL_IS_SUM, model.getIssum());
        cv.put(COL_IS_TEST, model.getTest());


        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        switch (name){
            // --- DAHOM --- //
            case "farsi":
                sqLiteDatabase.insert(FARSI_TABLE_NAME, null, cv);
                break;
            case "arabi":
                sqLiteDatabase.insert(ARABI_TABLE_NAME, null, cv);
                break;
            case "dini":
                sqLiteDatabase.insert(DINI_TABLE_NAME, null, cv);
                break;
            case "zaban":
                sqLiteDatabase.insert(ZABAN_TABLE_NAME, null, cv);
                break;
            case "riazi":
                sqLiteDatabase.insert(RIAZI_TABLE_NAME, null, cv);
                break;
            case "hendese":
                sqLiteDatabase.insert(HENDESE_TABLE_NAME, null, cv);
                break;
            case "fizik":
                sqLiteDatabase.insert(FIZIK_TABLE_NAME, null, cv);
                break;
            case "shimi":
                sqLiteDatabase.insert(SHIMI_TABLE_NAME, null, cv);
                break;
            case "zist":
                sqLiteDatabase.insert(ZIST_TABLE_NAME, null, cv);
                break;
            case "fonon":
                sqLiteDatabase.insert(FONON_TABLE_NAME, null, cv);
                break;
            case "riazie":
                sqLiteDatabase.insert(RIAZIE_TABLE_NAME, null, cv);
                break;
            case "tari":
                sqLiteDatabase.insert(TARI_TABLE_NAME, null, cv);
                break;
            case "jame":
                sqLiteDatabase.insert(JAME_TABLE_NAME, null, cv);
                break;
            case "jogh":
                sqLiteDatabase.insert(JOGH_TABLE_NAME, null, cv);
                break;
            case "egh":
                sqLiteDatabase.insert(EGH_TABLE_NAME, null, cv);
                break;
            case "mant":
                sqLiteDatabase.insert(MANT_TABLE_NAME, null, cv);
                break;


            // --- YAZDAHOM --- //
            case "farsi_11":
                sqLiteDatabase.insert(FARSI_TABLE_NAME_11, null, cv);
                break;
            case "arabi_11":
                sqLiteDatabase.insert(ARABI_TABLE_NAME_11, null, cv);
                break;
            case "dini_11":
                sqLiteDatabase.insert(DINI_TABLE_NAME_11, null, cv);
                break;
            case "zaban_11":
                sqLiteDatabase.insert(ZABAN_TABLE_NAME_11, null, cv);
                break;
            case "riazi_11":
                sqLiteDatabase.insert(HESAB_TABLE_NAME_11, null, cv);
                break;
            case "hendese_11":
                sqLiteDatabase.insert(HENDESE_TABLE_NAME_11, null, cv);
                break;
            case "fizik_11":
                sqLiteDatabase.insert(FIZIK_TABLE_NAME_11, null, cv);
                break;
            case "shimi_11":
                sqLiteDatabase.insert(SHIMI_TABLE_NAME_11, null, cv);
                break;
            case "amar_11":
                sqLiteDatabase.insert(AMAR_TABLE_NAME_11, null, cv);
                break;
            case "riazit_11":
                sqLiteDatabase.insert(RIAZIT_TABLE_NAME_11, null, cv);
                break;
            case "zist_11":
                sqLiteDatabase.insert(ZIST_TABLE_NAME_11, null, cv);
                break;
            case "dinie_11":
                sqLiteDatabase.insert(DINIE_TABLE_NAME_11, null, cv);
                break;
            case "fonon_11":
                sqLiteDatabase.insert(FONON_TABLE_NAME_11, null, cv);
                break;
            case "riazie_11":
                sqLiteDatabase.insert(RIAZIE_TABLE_NAME_11, null, cv);
                break;
            case "tari_11":
                sqLiteDatabase.insert(TARI_TABLE_NAME_11, null, cv);
                break;
            case "jame_11":
                sqLiteDatabase.insert(JAME_TABLE_NAME_11, null, cv);
                break;
            case "jogh_11":
                sqLiteDatabase.insert(JOGH_TABLE_NAME_11, null, cv);
                break;
            case "ravan_11":
                sqLiteDatabase.insert(RAVAN_TABLE_NAME_11, null, cv);
                break;
            case "fals_11":
                sqLiteDatabase.insert(FALS_TABLE_NAME_11, null, cv);
                break;


            // --- YAZDAHOM --- //
            case "farsi_12":
                sqLiteDatabase.insert(FARSI_TABLE_NAME_12, null, cv);
                break;
            case "arabi_12":
                sqLiteDatabase.insert(ARABI_TABLE_NAME_12, null, cv);
                break;
            case "dini_12":
                sqLiteDatabase.insert(DINI_TABLE_NAME_12, null, cv);
                break;
            case "zaban_12":
                sqLiteDatabase.insert(ZABAN_TABLE_NAME_12, null, cv);
                break;
            case "hesab_12":
                sqLiteDatabase.insert(HESAB_TABLE_NAME_12, null, cv);
                break;
            case "hendese_12":
                sqLiteDatabase.insert(HENDESE_TABLE_NAME_12, null, cv);
                break;
            case "fizik_12":
                sqLiteDatabase.insert(FIZIK_TABLE_NAME_12, null, cv);
                break;
            case "shimi_12":
                sqLiteDatabase.insert(SHIMI_TABLE_NAME_12, null, cv);
                break;
            case "gosas_12":
                sqLiteDatabase.insert(GOSAS_TABLE_NAME_12, null, cv);
                break;
            case "riazit_12":
                sqLiteDatabase.insert(RIAZIT_TABLE_NAME_12, null, cv);
                break;
            case "zist_12":
                sqLiteDatabase.insert(ZIST_TABLE_NAME_12, null, cv);
                break;
            case "fizikt_12":
                sqLiteDatabase.insert(FIZIKT_TABLE_NAME_12, null, cv);
                break;
            case "fonon_12":
                sqLiteDatabase.insert(FONON_TABLE_NAME_12, null, cv);
                break;
            case "riazie_12":
                sqLiteDatabase.insert(RIAZIE_TABLE_NAME_12, null, cv);
                break;
            case "tari_12":
                sqLiteDatabase.insert(TARI_TABLE_NAME_12, null, cv);
                break;
            case "jame_12":
                sqLiteDatabase.insert(JAME_TABLE_NAME_12, null, cv);
                break;
            case "jogh_12":
                sqLiteDatabase.insert(JOGH_TABLE_NAME_12, null, cv);
                break;
            case "fals_12":
                sqLiteDatabase.insert(FALS_TABLE_NAME_12, null, cv);
                break;
        }
    }


    public void addlessons(List<LessonModel> models,String name) {
        for (int i = 0; i < models.size(); i++) {
            if (!checkLessonExist(models.get(i).getId(), name)) {
                switch (name){
                    // --- DAHOM --- //
                    case "farsi":
                        addlesson(models.get(i),"farsi");
                        break;
                    case "arabi":
                        addlesson(models.get(i),"arabi");
                        break;
                    case "dini":
                        addlesson(models.get(i),"dini");
                        break;
                    case "zaban":
                        addlesson(models.get(i),"zaban");
                        break;
                    case "riazi":
                        addlesson(models.get(i),"riazi");
                        break;
                    case "hendese":
                        addlesson(models.get(i),"hendese");
                        break;
                    case "fizik":
                        addlesson(models.get(i),"fizik");
                        break;
                    case "shimi":
                        addlesson(models.get(i),"shimi");
                        break;
                    case "zist":
                        addlesson(models.get(i),"zist");
                        break;
                    case "fonon":
                        addlesson(models.get(i),"fonon");
                        break;
                    case "riazie":
                        addlesson(models.get(i),"riazie");
                        break;
                    case "tari":
                        addlesson(models.get(i),"tari");
                        break;
                    case "jame":
                        addlesson(models.get(i),"jame");
                        break;
                    case "jogh":
                        addlesson(models.get(i),"jogh");
                        break;
                    case "egh":
                        addlesson(models.get(i),"egh");
                        break;
                    case "mant":
                        addlesson(models.get(i),"mant");
                        break;

                    // --- YAZDAHOM --- //
                    case "farsi_11":
                        addlesson(models.get(i),"farsi_11");
                        break;
                    case "arabi_11":
                        addlesson(models.get(i),"arabi_11");
                        break;
                    case "dini_11":
                        addlesson(models.get(i),"dini_11");
                        break;
                    case "zaban_11":
                        addlesson(models.get(i),"zaban_11");
                        break;
                    case "riazi_11":
                        addlesson(models.get(i),"riazi_11");
                        break;
                    case "hendese_11":
                        addlesson(models.get(i),"hendese_11");
                        break;
                    case "fizik_11":
                        addlesson(models.get(i),"fizik_11");
                        break;
                    case "shimi_11":
                        addlesson(models.get(i),"shimi_11");
                        break;
                    case "amar_11":
                        addlesson(models.get(i),"amar_11");
                        break;
                    case "riazit_11":
                        addlesson(models.get(i),"riazit_11");
                        break;
                    case "zist_11":
                        addlesson(models.get(i),"zist_11");
                        break;
                    case "dinie_11":
                        addlesson(models.get(i),"dinie_11");
                        break;
                    case "fonon_11":
                        addlesson(models.get(i),"fonon_11");
                        break;
                    case "riazie_11":
                        addlesson(models.get(i),"riazie_11");
                        break;
                    case "tari_11":
                        addlesson(models.get(i),"tari_11");
                        break;
                    case "jame_11":
                        addlesson(models.get(i),"jame_11");
                        break;
                    case "jogh_11":
                        addlesson(models.get(i),"jogh_11");
                        break;
                    case "ravan_11":
                        addlesson(models.get(i),"ravan_11");
                        break;
                    case "fals_11":
                        addlesson(models.get(i),"fals_11");
                        break;



                    // --- DAVAZDAHOM --- //
                    case "farsi_12":
                        addlesson(models.get(i),"farsi_12");
                        break;
                    case "arabi_12":
                        addlesson(models.get(i),"arabi_12");
                        break;
                    case "dini_12":
                        addlesson(models.get(i),"dini_12");
                        break;
                    case "zaban_12":
                        addlesson(models.get(i),"zaban_12");
                        break;
                    case "hesab_12":
                        addlesson(models.get(i),"hesab_12");
                        break;
                    case "hendese_12":
                        addlesson(models.get(i),"hendese_12");
                        break;
                    case "fizik_12":
                        addlesson(models.get(i),"fizik_12");
                        break;
                    case "shimi_12":
                        addlesson(models.get(i),"shimi_12");
                        break;
                    case "gosas_12":
                        addlesson(models.get(i),"gosas_12");
                        break;
                    case "riazit_12":
                        addlesson(models.get(i),"riazit_12");
                        break;
                    case "zist_12":
                        addlesson(models.get(i),"zist_12");
                        break;
                    case "fizikt_12":
                        addlesson(models.get(i),"fizikt_12");
                        break;
                    case "fonon_12":
                        addlesson(models.get(i),"fonon_12");
                        break;
                    case "riazie_12":
                        addlesson(models.get(i),"riazie_12");
                        break;
                    case "tari_12":
                        addlesson(models.get(i),"tari_12");
                        break;
                    case "jame_12":
                        addlesson(models.get(i),"jame_12");
                        break;
                    case "jogh_12":
                        addlesson(models.get(i),"jogh_12");
                        break;
                    case "fals_12":
                        addlesson(models.get(i),"fals_12");
                        break;
                }
            }
        }
    }


    // --- GET LESSON --- //

    public List<LessonModel> getlessons(String name) {

        List<LessonModel> models = new ArrayList<>();

        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + name, null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            while (!cursor.isAfterLast()) {
                LessonModel model = new LessonModel();
                model.setId(cursor.getInt(0));
                model.setLesson(cursor.getInt(1));
                model.setIsRead(cursor.getInt(2));
                model.setIssum(cursor.getInt(3));
                model.setTest(cursor.getInt(4));
                models.add(model);
                cursor.moveToNext();
            }
        }
        cursor.close();
        sqLiteDatabase.close();
        return models;
    }

    // --- for read ---- //
    public void setlessonsisread(int moldelid, int isRead, String name) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_IS_READ, isRead);
        switch (name){
            // --- DAHOM --- //
            case "farsi":
                sqLiteDatabase.update(FARSI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi":
                sqLiteDatabase.update(ARABI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini":
                sqLiteDatabase.update(DINI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban":
                sqLiteDatabase.update(ZABAN_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazi":
                sqLiteDatabase.update(RIAZI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese":
                sqLiteDatabase.update(HENDESE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik":
                sqLiteDatabase.update(FIZIK_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi":
                sqLiteDatabase.update(SHIMI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist":
                sqLiteDatabase.update(ZIST_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon":
                sqLiteDatabase.update(FONON_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari":
                sqLiteDatabase.update(TARI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame":
                sqLiteDatabase.update(JAME_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh":
                sqLiteDatabase.update(JOGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "egh":
                sqLiteDatabase.update(EGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "mant":
                sqLiteDatabase.update(MANT_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;

            // --- YAZDAHOM --- //
            case "farsi_11":
                sqLiteDatabase.update(FARSI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_11":
                sqLiteDatabase.update(ARABI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_11":
                sqLiteDatabase.update(DINI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_11":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazi_11":
                sqLiteDatabase.update(HESAB_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_11":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_11":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_11":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "amar_11":
                sqLiteDatabase.update(AMAR_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_11":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_11":
                sqLiteDatabase.update(ZIST_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dinie_11":
                sqLiteDatabase.update(DINIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_11":
                sqLiteDatabase.update(FONON_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_11":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_11":
                sqLiteDatabase.update(TARI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_11":
                sqLiteDatabase.update(JAME_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_11":
                sqLiteDatabase.update(JOGH_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "ravan_11":
                sqLiteDatabase.update(RAVAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_11":
                sqLiteDatabase.update(FALS_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;


            // --- DAVAZDAHOM --- //
            case "farsi_12":
                sqLiteDatabase.update(FARSI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_12":
                sqLiteDatabase.update(ARABI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_12":
                sqLiteDatabase.update(DINI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_12":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hesab_12":
                sqLiteDatabase.update(HESAB_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_12":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_12":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_12":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "gosas_12":
                sqLiteDatabase.update(GOSAS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_12":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_12":
                sqLiteDatabase.update(ZIST_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizikt_12":
                sqLiteDatabase.update(FIZIKT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_12":
                sqLiteDatabase.update(FONON_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_12":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_12":
                sqLiteDatabase.update(TARI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_12":
                sqLiteDatabase.update(JAME_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_12":
                sqLiteDatabase.update(JOGH_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_12":
                sqLiteDatabase.update(FALS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
        }
        sqLiteDatabase.close();
    }

    // --- for summaraize --- //
    public void setlessonsisSum(int moldelid, int isSum, String name) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_IS_SUM, isSum);
        switch (name){
            // ---
            case "farsi":
                sqLiteDatabase.update(FARSI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi":
                sqLiteDatabase.update(ARABI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini":
                sqLiteDatabase.update(DINI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban":
                sqLiteDatabase.update(ZABAN_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "rizai":
                sqLiteDatabase.update(RIAZI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese":
                sqLiteDatabase.update(HENDESE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik":
                sqLiteDatabase.update(FIZIK_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi":
                sqLiteDatabase.update(SHIMI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist":
                sqLiteDatabase.update(ZIST_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon":
                sqLiteDatabase.update(FONON_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari":
                sqLiteDatabase.update(TARI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame":
                sqLiteDatabase.update(JAME_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh":
                sqLiteDatabase.update(JOGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "egh":
                sqLiteDatabase.update(EGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "mant":
                sqLiteDatabase.update(MANT_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;

            // --- YAZDAHOM --- //
            case "farsi_11":
                sqLiteDatabase.update(FARSI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_11":
                sqLiteDatabase.update(ARABI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_11":
                sqLiteDatabase.update(DINI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_11":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazi_11":
                sqLiteDatabase.update(HESAB_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_11":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_11":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_11":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "amar_11":
                sqLiteDatabase.update(AMAR_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_11":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_11":
                sqLiteDatabase.update(ZIST_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dinie_11":
                sqLiteDatabase.update(DINIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_11":
                sqLiteDatabase.update(FONON_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_11":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_11":
                sqLiteDatabase.update(TARI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_11":
                sqLiteDatabase.update(JAME_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_11":
                sqLiteDatabase.update(JOGH_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "ravan_11":
                sqLiteDatabase.update(RAVAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_11":
                sqLiteDatabase.update(FALS_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;


            // --- DAVAZDAHOM --- //
            case "farsi_12":
                sqLiteDatabase.update(FARSI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_12":
                sqLiteDatabase.update(ARABI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_12":
                sqLiteDatabase.update(DINI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_12":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hesab_12":
                sqLiteDatabase.update(HESAB_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_12":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_12":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_12":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "gosas_12":
                sqLiteDatabase.update(GOSAS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_12":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_12":
                sqLiteDatabase.update(ZIST_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizikt_12":
                sqLiteDatabase.update(FIZIKT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_12":
                sqLiteDatabase.update(FONON_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_12":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_12":
                sqLiteDatabase.update(TARI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_12":
                sqLiteDatabase.update(JAME_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_12":
                sqLiteDatabase.update(JOGH_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_12":
                sqLiteDatabase.update(FALS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
        }
        sqLiteDatabase.close();
    }
    
    // --- for test ---//
    public void setlessonsisTest(int moldelid, int isTest, String name) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_IS_TEST, isTest);
        switch (name){
            case "farsi":
                sqLiteDatabase.update(FARSI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi":
                sqLiteDatabase.update(ARABI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini":
                sqLiteDatabase.update(DINI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban":
                sqLiteDatabase.update(ZABAN_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "rizai":
                sqLiteDatabase.update(RIAZI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese":
                sqLiteDatabase.update(HENDESE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik":
                sqLiteDatabase.update(FIZIK_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi":
                sqLiteDatabase.update(SHIMI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist":
                sqLiteDatabase.update(ZIST_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon":
                sqLiteDatabase.update(FONON_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari":
                sqLiteDatabase.update(TARI_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame":
                sqLiteDatabase.update(JAME_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh":
                sqLiteDatabase.update(JOGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "egh":
                sqLiteDatabase.update(EGH_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "mant":
                sqLiteDatabase.update(MANT_TABLE_NAME, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;

            // --- YAZDAHOM --- //
            case "farsi_11":
                sqLiteDatabase.update(FARSI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_11":
                sqLiteDatabase.update(ARABI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_11":
                sqLiteDatabase.update(DINI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_11":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazi_11":
                sqLiteDatabase.update(HESAB_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_11":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_11":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_11":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "amar_11":
                sqLiteDatabase.update(AMAR_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_11":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_11":
                sqLiteDatabase.update(ZIST_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dinie_11":
                sqLiteDatabase.update(DINIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_11":
                sqLiteDatabase.update(FONON_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_11":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_11":
                sqLiteDatabase.update(TARI_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_11":
                sqLiteDatabase.update(JAME_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_11":
                sqLiteDatabase.update(JOGH_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "ravan_11":
                sqLiteDatabase.update(RAVAN_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_11":
                sqLiteDatabase.update(FALS_TABLE_NAME_11, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;


            // --- DAVAZDAHOM --- //
            case "farsi_12":
                sqLiteDatabase.update(FARSI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "arabi_12":
                sqLiteDatabase.update(ARABI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "dini_12":
                sqLiteDatabase.update(DINI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zaban_12":
                sqLiteDatabase.update(ZABAN_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hesab_12":
                sqLiteDatabase.update(HESAB_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "hendese_12":
                sqLiteDatabase.update(HENDESE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizik_12":
                sqLiteDatabase.update(FIZIK_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "shimi_12":
                sqLiteDatabase.update(SHIMI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "gosas_12":
                sqLiteDatabase.update(GOSAS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazit_12":
                sqLiteDatabase.update(RIAZIT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "zist_12":
                sqLiteDatabase.update(ZIST_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fizikt_12":
                sqLiteDatabase.update(FIZIKT_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fonon_12":
                sqLiteDatabase.update(FONON_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "riazie_12":
                sqLiteDatabase.update(RIAZIE_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "tari_12":
                sqLiteDatabase.update(TARI_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jame_12":
                sqLiteDatabase.update(JAME_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "jogh_12":
                sqLiteDatabase.update(JOGH_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
            case "fals_12":
                sqLiteDatabase.update(FALS_TABLE_NAME_12, contentValues, COL_ID + " = ?", new String[]{String.valueOf(moldelid)});
                break;
        }
        sqLiteDatabase.close();
    }
    
    
    
    

    public boolean checkLessonExist(int lessonId,String name) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor;
        switch (name){
            // --- DAHOM --- //
            case "farsi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "arabi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "dini":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zaban":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "hendese":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fizik":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "shimi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zist":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fonon":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazie":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "tari":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jame":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jogh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "egh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + EGH_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "mant":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MANT_TABLE_NAME + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;



            // --- YAZDAHOM --- //
            case "farsi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "arabi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "dini_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zaban_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "hendese_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fizik_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "shimi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "amar_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + AMAR_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazit_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zist_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "dinie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINIE_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fonon_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "tari_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jame_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jogh_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "ravan_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RAVAN_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fals_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_11 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;



            // --- DAVAZDAHOM --- //
            case "farsi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "arabi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "dini_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zaban_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "hesab_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "hendese_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fizik_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "shimi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "gosas_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + GOSAS_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazit_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "zist_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fizikt_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIKT_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fonon_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "riazie_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "tari_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jame_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "jogh_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;
            case "fals_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_12 + " WHERE " + COL_ID + " = ?", new String[]{String.valueOf(lessonId)});
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        return cursor.moveToFirst();
    }

    public int isChecked(String name) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor;
        switch (name){
            case "farsi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "egh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + EGH_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "mant":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MANT_TABLE_NAME + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;


            // --- YAZDAHOM --- //
            case "farsi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "amar_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + AMAR_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dinie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINIE_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "ravan_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RAVAN_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_11 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;

            // --- DAVAZDAHOM --- //
            case "farsi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hesab_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "gosas_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + GOSAS_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizikt_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIKT_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_12 + " WHERE " + COL_IS_READ + " = ?", new String[]{String.valueOf(1)});
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        int count = cursor.getCount();
        cursor.close();
        return count;
    }


    // --- for sum ---//

    public int isSumed(String name) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor;
        switch (name){
            case "farsi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "egh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + EGH_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "mant":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MANT_TABLE_NAME + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;

            // --- YAZDAHOM --- //
            case "farsi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "amar_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + AMAR_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dinie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINIE_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "ravan_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RAVAN_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_11 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;

            // --- DAVAZDAHOM --- //
            case "farsi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hesab_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "gosas_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + GOSAS_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizikt_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIKT_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_12 + " WHERE " + COL_IS_SUM + " = ?", new String[]{String.valueOf(1)});
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

    // --- for test ---//

    public int isTested(String name) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor;
        switch (name){
            case "farsi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "egh":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + EGH_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "mant":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MANT_TABLE_NAME + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;

            // --- YAZDAHOM --- //
            case "farsi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "amar_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + AMAR_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dinie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINIE_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "ravan_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RAVAN_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_11":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_11 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;

            // --- DAVAZDAHOM --- //
            case "farsi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FARSI_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "arabi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ARABI_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "dini_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + DINI_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zaban_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZABAN_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hesab_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HESAB_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "hendese_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + HENDESE_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizik_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIK_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "shimi_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SHIMI_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "gosas_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + GOSAS_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazit_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIT_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "zist_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + ZIST_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fizikt_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FIZIKT_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fonon_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FONON_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "riazie_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + RIAZIE_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "tari_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + TARI_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jame_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JAME_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "jogh_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + JOGH_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;
            case "fals_12":
                cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + FALS_TABLE_NAME_12 + " WHERE " + COL_IS_TEST + " = ?", new String[]{String.valueOf(1)});
                break;

            default:
                throw new IllegalStateException("Unexpected value: is test" + name);
        }
        int count = cursor.getCount();
        cursor.close();
        return count;
    }

}
