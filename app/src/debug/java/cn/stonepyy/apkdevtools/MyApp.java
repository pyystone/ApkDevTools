package cn.stonepyy.apkdevtools;

import android.app.Application;

/**
 * Created by pyystone on 16/11/24.
 * email: pyystone@163.com
 * QQ: 862429936
 * github: https://github.com/pyystone
 * code shelf life : forever :-D
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initDB();
    }

    private void initDB() {
        MyTestDBHelper helper = new MyTestDBHelper(this,"test.db",null,1);
    }

}
