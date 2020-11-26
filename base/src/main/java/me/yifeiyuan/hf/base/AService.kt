package me.yifeiyuan.hf.base

import com.alibaba.android.arouter.facade.template.IProvider

/**
 * Created by 程序亦非猿 on 2020/11/25.
 */
interface AService : IProvider {
    fun request() : String
}