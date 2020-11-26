package me.yifeiyuan.hf.base

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route

/**
 * Created by 程序亦非猿 on 2020/11/25.
 */
@Route(path = "/base/aservice", name = "AServiceProvider")
class AServiceProvider : AService {
    override fun request(): String {
        return "AServiceProvider"
    }

    override fun init(context: Context?) {
    }
}