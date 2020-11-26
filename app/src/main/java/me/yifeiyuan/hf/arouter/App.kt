package me.yifeiyuan.hf.arouter

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Created by 程序亦非猿 on 2020/11/25.
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }
}