package cn.stonepyy.apkdevtools;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pyystone on 16/11/24.
 * email: pyystone@163.com
 * QQ: 862429936
 * github: https://github.com/pyystone
 * code shelf life : forever :-D
 */

public class MyTestDBHelper extends SQLiteOpenHelper {
    public MyTestDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        generateDB(sqLiteDatabase);
    }

    private void generateDB(SQLiteDatabase db) {
        db.execSQL("create table tbl_test (id integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
