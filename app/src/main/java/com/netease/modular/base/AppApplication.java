package com.netease.modular.base;

import com.netease.common.base.BaseApplication;

public class AppApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        // 如果项目有100个Activity，这种加法会不会太那个？
//        RecordPathManager.joinGroup("app", "MainActivity", MainActivity.class);
//        RecordPathManager.joinGroup("order", "Order_MainActivity", Order_MainActivity.class);
//        RecordPathManager.joinGroup("personal", "Personal_MainActivity", Personal_MainActivity.class);
    }
}
