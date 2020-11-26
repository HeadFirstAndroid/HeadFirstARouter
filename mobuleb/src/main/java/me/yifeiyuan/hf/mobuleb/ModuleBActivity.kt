package me.yifeiyuan.hf.mobuleb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter


@Route(path = "/b/moduleb")
class ModuleBActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_b)
        val uriStr = intent.getStringExtra(ARouter.RAW_URI)
        println(uriStr)
    }
}